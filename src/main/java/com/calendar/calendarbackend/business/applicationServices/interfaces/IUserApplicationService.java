package com.calendar.calendarbackend.business.applicationServices.interfaces;

import com.calendar.calendarbackend.business.dtos.User;

public interface IUserApplicationService {
    User getUserById(long id);
}
