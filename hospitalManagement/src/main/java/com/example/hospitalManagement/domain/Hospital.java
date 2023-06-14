package com.example.hospitalManagement.domain;

import jakarta.persistence.Entity;

@Entity
public class Hospital {

    private Long id;

    private String name;
    private String address;

}
