package com.calendar.calendarbackend.infrastructure.entities;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CalendarEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @ManyToOne
    @JoinColumn(name = "calendar_id")
    Calendar calendar;
    String title;
    Date beginDate;
    Date endDate;
    String location;
    String description;

    public CalendarEvent(long id, Calendar calendar, String title, Date beginDate, Date endDate, String location, String description) {
        this.id = id;
        this.calendar = calendar;
        this.title = title;
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.location = location;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

