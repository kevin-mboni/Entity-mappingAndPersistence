package com.example.jpaLab.model;

import jakarta.persistence.*;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long patientNumber;

    private String name;
    private String surname;
    private String address;
    private String phoneNumber;
    private String diagnosis;

    @ManyToOne
    @JoinColumn(name = "ward_id")
    private Ward ward;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    // Getters and Setters
}
