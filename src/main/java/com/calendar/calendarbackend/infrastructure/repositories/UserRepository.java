package com.calendar.calendarbackend.infrastructure.repositories;

import com.calendar.calendarbackend.infrastructure.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByProviderIdAndProvider(String providerId, String provider);
}
