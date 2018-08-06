package com.calendar.calendarbackend.web.controller;

import com.calendar.calendarbackend.business.domainServices.CurrentUserService;
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

    CurrentUserService userService;
    UserRepository userRepository;
    CalendarEventRepository calendarEventRepository;
    CalendarRepository calendarRepository;

    @Autowired
    public TestController(CurrentUserService currentUserService, UserRepository userRepository, CalendarRepository calendarRepository, CalendarEventRepository calendarEventRepository){
        this.userService = currentUserService;
        this.calendarEventRepository = calendarEventRepository;
        this.calendarRepository = calendarRepository;
        this.userRepository = userRepository;
    }

    @RequestMapping("/userinformation")
    @ResponseBody
    public Object getUser (Principal principal) {

        return userService.getAuthentication();
    }
}
