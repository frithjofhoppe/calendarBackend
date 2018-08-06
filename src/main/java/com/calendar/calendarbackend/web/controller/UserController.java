package com.calendar.calendarbackend.web.controller;

import com.calendar.calendarbackend.business.applicationServices.interfaces.IUserApplicationService;
import com.calendar.calendarbackend.business.dtos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private IUserApplicationService userApplicationService;

    @Autowired
    public UserController(IUserApplicationService userApplicationService){
        this.userApplicationService = userApplicationService;
    }

    @RequestMapping(path = "/{userId}", method = RequestMethod.GET)
    public User getUserById(@RequestParam("userId") long userId) {
        return userApplicationService.getUserById(userId);
    }
}
