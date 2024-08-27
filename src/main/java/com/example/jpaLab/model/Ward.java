package com.example.jpaLab.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Ward {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer wardNumber;
    private Integer numberOfBeds;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @OneToOne
    private Nurse supervisor;

    @OneToMany(mappedBy = "ward")
    private List<Patient> patients;

    // Getters and Setters
}
