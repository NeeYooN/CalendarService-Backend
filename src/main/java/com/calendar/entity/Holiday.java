package com.calendar.entity;

import io.micronaut.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Holiday {
    @Id
    @GeneratedValue
    private Long holidayId;
    private String holidayDesc;
    private LocalDate holidayDate;

    @ManyToOne
    @JoinColumn(name = "calendar_id")
    private Calendar calendar;
}
