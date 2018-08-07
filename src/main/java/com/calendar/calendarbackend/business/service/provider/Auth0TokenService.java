package com.calendar.calendarbackend.business.service.provider;

import com.calendar.calendarbackend.business.dtos.Auth0Token;
import com.calendar.calendarbackend.business.dtos.Auth0TokenRequest;
import com.calendar.calendarbackend.web.config.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@Service
public class Auth0TokenService {

    private LocalDateTime expirationTime;
    private Auth0Token token;
    private RestTemplateConfiguration rest;
    private AppProperties properties;

    @Autowired
    public Auth0TokenService(RestTemplateConfiguration rest, AppProperties properties){
        this.rest = rest;
        this.properties = properties;
    }

    public Auth0Token getToken() {
        if (isTokenExpired()){
            fetchToken();
        }
        return token;
    }

    private void fetchToken(){
        RestTemplate http = rest.restTemplate();

        Auth0TokenRequest request = new Auth0TokenRequest();
        request.audience = properties.getManagementAudience();
        request.client_id = properties.getManagementClientId();
        request.client_secret = properties.getManagementClientSecret();
        request.grant_type = properties.getManagementGrantType();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Auth0TokenRequest> httpEntity = new HttpEntity<>(request, headers);
        Auth0Token result = http.postForObject(properties.getManagementUrl(), request , Auth0Token.class);

        token = result;
        expirationTime = LocalDateTime.now().plusSeconds(Integer.parseInt(result.expires_in));
    }

    private boolean isTokenExpired(){
        LocalDateTime currentTime = LocalDateTime.now().minusMinutes(10);
        if(expirationTime == null || expirationTime.isAfter(currentTime)){
            return true;
        }
        return false;
    }
}
