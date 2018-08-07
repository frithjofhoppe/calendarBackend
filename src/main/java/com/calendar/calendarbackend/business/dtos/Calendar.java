package com.calendar.calendarbackend.business.dtos;

import com.calendar.calendarbackend.business.dtos.user.User;

import java.util.Date;
import java.util.List;

public class Calendar {
    public long id;
    public User user;
    public String identifier;
    public Date creationDate;
    public List<CalendarEvent> calendarEvents;
}
