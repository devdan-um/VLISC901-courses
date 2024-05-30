package com.univer.courses.model;
import java.time.LocalDate;
public class CourseRequest {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaConclusion;

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
