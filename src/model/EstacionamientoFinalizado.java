package model;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class EstacionamientoFinalizado {
    private Estacionamiento datosEstacionamiento;
    private LocalTime horaSalida;
    public EstacionamientoFinalizado(Estacionamiento datosEstacionamiento, LocalTime horaSalida) {

        this.datosEstacionamiento = datosEstacionamiento;
        this.horaSalida = horaSalida;
    }

    public boolean getStatusEstacionamiento() {
        return datosEstacionamiento.getStatusEstacionamiento();
    }

    public void setStatusEstacionamiento() {
        datosEstacionamiento.setStatusEstacionamiento(false);
    }

    public LocalDateTime getHoraEntrada() {
        return datosEstacionamiento.getHoraEntrada();
    }

    public String getMatricula() {
        return datosEstacionamiento.getMatricula();
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }
}


