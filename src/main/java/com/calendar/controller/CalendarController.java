package com.calendar.controller;

import com.calendar.entity.*;
import com.calendar.service.CalendarService;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;

@Controller("/api")
public class CalendarController {

    @Inject
    private CalendarService calendarService;

    @Get("/clients")
    public List<Client> getClients() {
        return calendarService.getAllClients();
    }
    @Get("/calendars/{calendarId}/holidays")
    public List<Holiday> getHolidays(@PathVariable Long calendarId) {
        return calendarService.getHolidaysByCalendarId(calendarId);
    }

    @Post("/holidays")
    public Holiday addHoliday(@Body Holiday holiday) {
        return calendarService.addHoliday(holiday);
    }

    @Put("/holidays")
    public Holiday updateHoliday(@Body Holiday holiday) {
        return calendarService.updateHoliday(holiday);
    }

    @Delete("/holidays/{holidayId}")
    public void deleteHoliday(@PathVariable Long holidayId) {
        calendarService.deleteHoliday(holidayId);
    }

}

