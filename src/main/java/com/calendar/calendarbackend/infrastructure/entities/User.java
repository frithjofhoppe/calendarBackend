package com.calendar.calendarbackend.infrastructure.entities;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String providerId;
    @Column(nullable = false)
    String provider;
    @OneToMany(mappedBy = "user")
    List<Calendar> calendars;

    public User(String providerId, String provider) {
        this.providerId = providerId;
        this.provider = provider;
    }

    public User(String providerId, String provider, List<Calendar> calendars) {
        this.providerId = providerId;
        this.provider = provider;
        this.calendars = calendars;
    }

    public List<Calendar> getCalendars() {
        return calendars;
    }

    public void setCalendars(List<Calendar> calendars) {
        this.calendars = calendars;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
