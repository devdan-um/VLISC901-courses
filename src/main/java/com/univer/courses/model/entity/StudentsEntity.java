package com.univer.courses.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "STUDENTS")
public class StudentsEntity {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

}
