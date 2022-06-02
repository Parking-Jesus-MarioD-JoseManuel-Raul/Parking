package model;

import java.time.LocalDate;

public class Bono {
    private String nombreBono;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private float precio;

    public Bono(String nombreBono, LocalDate fechaInicio, LocalDate fechaFin, float precio) {
        this.nombreBono = nombreBono;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public String getNombreBono() {
        return nombreBono;
    }

    public void setNombreBono(String nombreBono) {
        this.nombreBono = nombreBono;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}
