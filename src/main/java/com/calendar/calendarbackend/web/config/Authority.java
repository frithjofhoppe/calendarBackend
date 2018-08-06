package com.calendar.calendarbackend.web.config;

import org.springframework.stereotype.Component;

@Component
public class Authority {
    public static final String USER = "access:restricted";
    public static final String ADMIN = "access:administration";
}
