package model;

import java.time.LocalDateTime;

public class Abonado extends Cliente {
    Bono bono;
    Estacionamiento datosEstacionamiento;

    public Abonado(Identificador identificador, String matricula, String payMethod, Bono bono, Estacionamiento datosEstacionamiento) {
        super(identificador, matricula, payMethod);
        this.bono = bono;
        this.datosEstacionamiento = datosEstacionamiento;
    }

    public LocalDateTime getHoraEntrada() {
        return getDatosEstacionamiento().getHoraEntrada();
    }

    public LocalDateTime getHoraSalida() {
        return getDatosEstacionamiento().getHoraSalida();
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

    public Bono getBono() {
        return bono;
    }

    public void setBono(Bono bono) {
        this.bono = bono;
    }

    public Estacionamiento getDatosEstacionamiento() {
        return datosEstacionamiento;
    }

    public void setDatosEstacionamiento(Estacionamiento datosEstacionamiento) {
        this.datosEstacionamiento = datosEstacionamiento;
    }

}
