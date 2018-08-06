package com.calendar.calendarbackend.infrastructure.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Calendar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
    String identifier;
    Date creationDate;
    @OneToMany(mappedBy = "calendar")
    List<CalendarEvent> calendarEvents;


    public Calendar(User user, String identifier, Date creationDate) {
        this.user = user;
        this.identifier = identifier;
        this.creationDate = creationDate;
    }

    public Calendar(User user, String identifier, Date creationDate, List<CalendarEvent> calendarEvents) {
        this.user = user;
        this.identifier = identifier;
        this.creationDate = creationDate;
        this.calendarEvents = calendarEvents;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getOwner() {
        return user;
    }

    public void setOwner(User owner) {
        this.user = owner;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
