package com.calendar.calendarbackend.web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class AppProperties {

    @Value("${auth0.managementUrl}")
    private String managementUrl;

    @Value("${auth0.managementClientId}")
    private String managementClientId;

    @Value("${auth0.managementClientSecret}")
    private String managementClientSecret;

    @Value("${auth0.managementGrantType}")
    private String managementGrantType;

    @Value("${auth0.managementAudience}")
    private String managementAudience;

    public String getManagementUrl() {
        return managementUrl;
    }

    public String getManagementClientId() {
        return managementClientId;
    }

    public String getManagementClientSecret() {
        return managementClientSecret;
    }

    public String getManagementGrantType() {
        return managementGrantType;
    }

    public String getManagementAudience() {
        return managementAudience;
    }
}
