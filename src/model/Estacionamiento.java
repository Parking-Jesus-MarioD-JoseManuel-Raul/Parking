package model;

import java.time.LocalDateTime;

public class Estacionamiento {
    private LocalDateTime horaEntrada;
    private String matricula;
    private boolean statusEstacionamiento;

    public Estacionamiento(LocalDateTime horaEntrada, String matricula) {
        this.horaEntrada = horaEntrada;
        this.matricula = matricula;
        this.statusEstacionamiento = getStatusEstacionamiento();
    }

    public boolean getStatusEstacionamiento() {
        return statusEstacionamiento;
    }

    public void setStatusEstacionamiento(boolean statusEstacionamiento) {
        this.statusEstacionamiento = statusEstacionamiento;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public String getMatricula() {
        return matricula;
    }

}
