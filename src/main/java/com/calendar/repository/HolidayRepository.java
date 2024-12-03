package com.calendar.repository;

import com.calendar.entity.Holiday;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface HolidayRepository extends CrudRepository<Holiday, Long> {
    List<Holiday> findByCalendarId(Long calendarId);
}
