package com.calendar.calendarbackend.business.dtos;

public class Auth0TokenRequest {
    public String grant_type;
    public String client_id;
    public String client_secret;
    public String audience;
}
