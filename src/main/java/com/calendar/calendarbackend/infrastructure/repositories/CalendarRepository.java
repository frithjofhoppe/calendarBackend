package com.calendar.calendarbackend.infrastructure.repositories;

import com.calendar.calendarbackend.infrastructure.entities.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, Long> {
}
