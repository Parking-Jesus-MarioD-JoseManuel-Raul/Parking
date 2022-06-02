package model;

import java.time.LocalTime;

public class Estacionamiento {
    private LocalTime horaEntrada;
    private String matricula;
    private boolean statusEstacionamiento;

    public Estacionamiento(LocalTime horaEntrada, String matricula) {
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

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public String getMatricula() {
        return matricula;
    }

}
