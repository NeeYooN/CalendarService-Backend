package com.calendar.service;
import com.calendar.entity.Calendar;
import com.calendar.entity.Client;
import com.calendar.entity.Holiday;
import com.calendar.repository.CalendarRepository;
import com.calendar.repository.ClientRepository;
import com.calendar.repository.HolidayRepository;
import io.micronaut.transaction.annotation.TransactionalAdvice;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class CalendarService {

    private final ClientRepository clientRepository;
    private final CalendarRepository calendarRepository;
    private final HolidayRepository holidayRepository;

    public CalendarService(ClientRepository clientRepository, CalendarRepository calendarRepository, HolidayRepository holidayRepository) {
        this.clientRepository = clientRepository;
        this.calendarRepository = calendarRepository;
        this.holidayRepository = holidayRepository;
    }

    public List<Client> getAllClients() {
        return (List<Client>) clientRepository.findAll();
    }

    public List<Calendar> getCalendarsByClientId(Long clientId) {
        return calendarRepository.findByClientId(clientId);
    }

    public List<Holiday> getHolidaysByCalendarId(Long calendarId) {
        return holidayRepository.findByCalendarId(calendarId);
    }

    @TransactionalAdvice
    public Holiday addHoliday(Holiday holiday) {
        return holidayRepository.save(holiday);
    }

    @TransactionalAdvice
    public Holiday updateHoliday(Holiday holiday) {
        return holidayRepository.update(holiday);
    }

    @TransactionalAdvice
    public void deleteHoliday(Long holidayId) {
        holidayRepository.deleteById(holidayId);
    }
}
