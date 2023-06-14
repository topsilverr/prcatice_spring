package com.example.hospitalManagement.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String dep_name;
    private Long career;

}
