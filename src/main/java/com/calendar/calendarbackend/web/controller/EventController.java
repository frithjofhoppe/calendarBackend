package com.calendar.calendarbackend.web.controller;

import com.calendar.calendarbackend.business.dtos.Calendar;
import com.calendar.calendarbackend.business.dtos.CalendarEvent;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/{userId}/calendar/{calendarId}/event")
public class EventController {

    @RequestMapping(method = RequestMethod.GET)
    public List<CalendarEvent> getCalendarEvents(){
        return null;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createEvent(@RequestBody CalendarEvent calendarEvent){

    }

    @RequestMapping(path = "/{eventId}", method = RequestMethod.GET)
    public CalendarEvent getCalendarEvent(@PathVariable("eventId") long eventId){
        return null;
    }

    @RequestMapping(path = "/{eventId}", method = RequestMethod.DELETE)
    public void deleteCalendarEventById(@PathVariable("eventId") long eventId){

    }

    @RequestMapping(path = "/{eventId}", method = RequestMethod.PUT)
    public void updateCalendarEvent(@RequestBody CalendarEvent calendarEvent){

    }
}
