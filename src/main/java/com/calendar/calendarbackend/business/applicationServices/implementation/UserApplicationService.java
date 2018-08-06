package com.calendar.calendarbackend.business.applicationServices.implementation;

import com.calendar.calendarbackend.business.applicationServices.interfaces.IUserApplicationService;
import com.calendar.calendarbackend.business.dtos.User;
import org.springframework.stereotype.Service;

@Service
public class UserApplicationService implements IUserApplicationService {
    @Override
    public User getUserById(long id) {
        return null;
    }
}
