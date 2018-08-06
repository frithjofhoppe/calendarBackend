package com.calendar.calendarbackend.web.controller;

import com.calendar.calendarbackend.business.dtos.Calendar;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user/{userId}/calendar")
public class CalendarController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Calendar> getCalendars(){
        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void getCalendars(@RequestBody Calendar calendar){

    }

    @RequestMapping(path = "/{calendarId}", method = RequestMethod.GET)
    public Calendar getCalendarById(@PathVariable("calendarId") long calendarId){
        return null;
    }

    @RequestMapping(path = "/{calendarId}", method = RequestMethod.DELETE)
    public void deleteCalendarById(@PathVariable("calendarId") long calendarId){

    }

    @RequestMapping(path = "/{calendarId}", method = RequestMethod.PUT)
    public void updateCalendar(@RequestBody Calendar calendar){

    }
}
