package model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Abonado extends Cliente {

    private static Estacionamiento datosEstacionamiento;
    private Bono bono;

    public Abonado(Identificador identificador, String matricula, String payMethod, Bono bono, Estacionamiento datosEstacionamiento) {
        super(identificador, matricula, payMethod);
        this.bono = bono;
        Abonado.datosEstacionamiento = datosEstacionamiento;
    }


    public LocalDateTime getHoraEntrada() {
        return getDatosEstacionamiento().getHoraEntrada();
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

    public static Estacionamiento getDatosEstacionamiento() {
        return datosEstacionamiento;
    }

    public void setDatosEstacionamiento(Estacionamiento datosEstacionamiento) {
        Abonado.datosEstacionamiento = datosEstacionamiento;
    }


    public void setEstadoBonoPagado() {
        bono.setEstadoBonoPagado();
    }

    @Override
    public String toString() {
        return "Abonado{" + "bono=" + bono + ", identificador=" + identificador + ", matricula='" + matricula + '\'' + ", payMethod='" + payMethod + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Abonado)) return false;
        Abonado abonado = (Abonado) o;
        return Objects.equals(bono, abonado.bono);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bono);
    }
}
