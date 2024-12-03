package com.calendar.entity;

import io.micronaut.data.annotation.Id;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Client {

    @Id
    @GeneratedValue
    private Long clientId;

    private String clientName;

    @OneToMany(mappedBy = "client")
    private List<Calendar> calendar;
}
