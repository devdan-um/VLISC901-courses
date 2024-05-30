package com.univer.courses.model;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
public class CourseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaConclusion;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaConclusion() {
        return fechaConclusion;
    }

    public void setFechaConclusion(LocalDate fechaConclusion) {
        this.fechaConclusion = fechaConclusion;
    }
}
