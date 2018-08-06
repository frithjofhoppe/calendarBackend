package com.calendar.calendarbackend.business.dtos;

import java.util.Date;

public class CalendarEvent {
    public long id;
    public Calendar calendar;
    public String title;
    public Date beginDate;
    public Date endDate;
    public String location;
    public String description;
}
