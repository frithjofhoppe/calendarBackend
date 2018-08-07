package com.calendar.calendarbackend.web.controller;

import com.calendar.calendarbackend.business.dtos.Auth0Token;
import com.calendar.calendarbackend.business.dtos.user.SocialUser;
import com.calendar.calendarbackend.business.service.provider.Auth0TokenService;
import com.calendar.calendarbackend.business.service.provider.Auth0UserService;
import com.calendar.calendarbackend.business.service.provider.CurrentUserService;
import com.calendar.calendarbackend.infrastructure.repositories.CalendarEventRepository;
import com.calendar.calendarbackend.infrastructure.repositories.CalendarRepository;
import com.calendar.calendarbackend.infrastructure.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class TestController {

    Auth0UserService tokenService;

    @Autowired
    public TestController(Auth0UserService tokenService) {
      this.tokenService = tokenService;
    }

    @RequestMapping("/test")
    @ResponseBody
    public SocialUser getUser(Principal principal) {
        return tokenService.getCurrentUser();
    }
}
