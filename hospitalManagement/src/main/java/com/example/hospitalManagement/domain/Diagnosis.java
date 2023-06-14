package com.example.hospitalManagement.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Diagnosis {

    @ManyToOne
    private Patient patient;

    private LocalDateTime time;
}
