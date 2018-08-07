package com.calendar.calendarbackend.business.dtos;

import java.time.LocalDateTime;

public class Auth0Token {
    public String access_token;
    public String scope;
    public String expires_in;
    public String token_type;
}
