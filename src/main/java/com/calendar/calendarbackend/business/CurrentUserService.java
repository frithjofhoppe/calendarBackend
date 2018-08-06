package com.calendar.calendarbackend.business;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class CurrentUserService {

    @Bean
    public Authentication getAuthentication(){
        return SecurityContextHolder.getContext().getAuthentication();
    }

    @Bean
    public Object getUsername(){
        Authentication authentication =  SecurityContextHolder.getContext().getAuthentication();
        if(authentication != null){
            return authentication.getPrincipal();
        }
        return "";
    }
}