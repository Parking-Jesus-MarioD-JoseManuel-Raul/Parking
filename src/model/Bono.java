package model;

import java.time.LocalDate;
import java.util.Objects;

public class Bono {
    private String nombreBono;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double precio;

    public Bono(String nombreBono, LocalDate fechaInicio, LocalDate fechaFin, Double precio) {
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

    @Override
    public String toString() {
        return "Bono{" + "nombreBono='" + nombreBono + '\'' + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", precio=" + precio + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bono)) return false;
        Bono bono = (Bono) o;
        return Objects.equals(nombreBono, bono.nombreBono) && Objects.equals(fechaInicio, bono.fechaInicio) && Objects.equals(fechaFin, bono.fechaFin) && Objects.equals(precio, bono.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreBono, fechaInicio, fechaFin, precio);
    }
}
