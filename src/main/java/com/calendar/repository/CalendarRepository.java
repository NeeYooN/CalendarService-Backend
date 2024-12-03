package com.calendar.repository;

import com.calendar.entity.Calendar;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface CalendarRepository extends CrudRepository<Calendar, Long> {
    List<Calendar> findByClientId(Long clientId);
}
