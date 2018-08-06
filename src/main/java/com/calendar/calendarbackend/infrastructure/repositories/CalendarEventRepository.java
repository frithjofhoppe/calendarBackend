package com.calendar.calendarbackend.infrastructure.repositories;

import com.calendar.calendarbackend.infrastructure.entities.CalendarEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarEventRepository extends JpaRepository<CalendarEvent, Long> {
}
