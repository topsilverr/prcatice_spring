package com.example.hospitalManagement.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor

public class Patient {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private Long age;
    private Gender gender;

}
