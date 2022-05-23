package model;

import java.time.LocalDateTime;

public class Esporadico extends Cliente {

    Estacionamiento datosEstacionamiento;

    public Esporadico(Identificador identificador, String matricula, String payMethod, Estacionamiento datosEstacionamiento) {
        super(identificador, matricula, payMethod);
        this.datosEstacionamiento = datosEstacionamiento;
    }

    public Estacionamiento getDatosEstacionamiento() {
        return datosEstacionamiento;
    }

    public void setDatosEstacionamiento(Estacionamiento datosEstacionamiento) {
        this.datosEstacionamiento = datosEstacionamiento;
    }

    public LocalDateTime getHoraEntrada() {
        return getDatosEstacionamiento().getHoraEntrada();
    }

    public LocalDateTime getHoraSalida() {
        return getDatosEstacionamiento().getHoraSalida();
    }

    public int getIdPlaza() {
        return getDatosEstacionamiento().getIdPlaza();
    }

    public Esporadico(Identificador identificador, String matricula, String payMethod) {
        super(identificador, matricula, payMethod);
    }

    @Override
    public Identificador getIdentificador() {
        return super.getIdentificador();
    }

    @Override
    public void setIdentificador(Identificador identificador) {
        super.setIdentificador(identificador);
    }

    @Override
    public String getMatricula() {
        return super.getMatricula();
    }

    @Override
    public void setMatricula(String matricula) {
        super.setMatricula(matricula);
    }

    @Override
    public String getPayMethod() {
        return super.getPayMethod();
    }

    @Override
    public void setPayMethod(String payMethod) {
        super.setPayMethod(payMethod);
    }

}
