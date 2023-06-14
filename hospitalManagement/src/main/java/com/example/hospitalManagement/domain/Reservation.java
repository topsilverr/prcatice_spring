package com.example.hospitalManagement.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
public class Reservation {

    @JoinColumn(name = "id")
    @ManyToOne
    private Patient patient;

    private LocalDateTime time;
}
