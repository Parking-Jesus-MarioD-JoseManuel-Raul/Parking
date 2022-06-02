package model;

import java.time.LocalDateTime;

public class EstacionamientoFinalizado {
    private Estacionamiento datosEstacionamiento;
    private LocalDateTime horaSalida;

    public EstacionamientoFinalizado(Estacionamiento datosEstacionamiento, LocalDateTime horaSalida) {
        this.datosEstacionamiento = datosEstacionamiento;
        this.horaSalida = horaSalida;
    }

    public boolean getStatusEstacionamiento() {
        return datosEstacionamiento.getStatusEstacionamiento();
    }

    public void setStatusEstacionamiento(boolean statusEstacionamiento) {
        datosEstacionamiento.setStatusEstacionamiento(statusEstacionamiento);
    }

    public LocalDateTime getHoraEntrada() {
        return datosEstacionamiento.getHoraEntrada();
    }

    public String getMatricula() {
        return datosEstacionamiento.getMatricula();
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }
}


