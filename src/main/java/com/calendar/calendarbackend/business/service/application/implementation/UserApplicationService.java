package com.calendar.calendarbackend.business.service.application.implementation;

import com.calendar.calendarbackend.business.service.application.interfaces.IUserApplicationService;
import com.calendar.calendarbackend.business.dtos.user.User;
import org.springframework.stereotype.Service;

@Service
public class UserApplicationService implements IUserApplicationService {
    @Override
    public User getUserById(long id) {
        return null;
    }
}
