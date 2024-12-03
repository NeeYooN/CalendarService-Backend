package com.calendar.entity;

import io.micronaut.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Calendar {

    @Id
    @GeneratedValue
    private Long calendarId;

    private String calendarName;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}