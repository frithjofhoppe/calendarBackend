package com.calendar.calendarbackend.business.service.provider;

import com.calendar.calendarbackend.business.dtos.user.SocialUser;
import com.calendar.calendarbackend.web.config.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Auth0UserService {

    private Auth0TokenService tokenService;
    private RestTemplateConfiguration rest;
    private AppProperties properties;
    private CurrentUserService currentUserService;

    @Autowired
    public Auth0UserService(Auth0TokenService tokenService, RestTemplateConfiguration rest, AppProperties properties, CurrentUserService currentUserService) {
        this.tokenService = tokenService;
        this.properties = properties;
        this.rest = rest;
        this.currentUserService = currentUserService;
    }

    public SocialUser getCurrentUser() {
        RestTemplate template = rest.restTemplate();
        HttpEntity entity = new HttpEntity(headers());
        String url = properties.getManagementAudience() + httpGetCurrentUserProviderQuery();
        ResponseEntity<SocialUser> response = template.exchange(url, HttpMethod.GET, entity, SocialUser.class);
        return response.getBody();
    }

    private String httpGetCurrentUserProviderQuery() {
        String userId = currentUserService.getId();
        String url = "users/";
        if (userId.length() > 0) {
            String[] splittedUserId = userId.split("\\|");
            url += splittedUserId[0] + "%7C" + splittedUserId[1];
            url += "?fields=email%2Cpicture%2Cname&include_fields=true";
            return url;
        }
        return "";
    }

    private HttpHeaders headers() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + tokenService.getToken().access_token);
        return headers;
    }
}
