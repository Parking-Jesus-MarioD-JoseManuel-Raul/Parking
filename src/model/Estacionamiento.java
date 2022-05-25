package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Estacionamiento {
    LocalDateTime horaEntrada;
    LocalDateTime horaSalida;


    public Estacionamiento(LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;

    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }



}
