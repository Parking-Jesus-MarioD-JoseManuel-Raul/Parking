package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Estacionamiento {
    LocalDateTime horaEntrada;
    LocalDateTime horaSalida;
    Plaza plazaParking;

    public Estacionamiento(LocalDateTime horaEntrada, LocalDateTime horaSalida, Plaza plazaParking) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.plazaParking = plazaParking;
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

    public int getIdPlaza() {
        return plazaParking.getIdPlaza();
    }

    public void setOcupado(boolean ocupado) {
        plazaParking.setOcupado(true);
    }

}
