package com.calendar.calendarbackend.business.service.application.interfaces;

import com.calendar.calendarbackend.business.dtos.user.User;

public interface IUserApplicationService {
    User getUserById(long id);
}
