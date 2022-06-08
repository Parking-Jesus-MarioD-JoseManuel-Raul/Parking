package controllers;

import model.Estacionamiento;
import model.EstacionamientoFinalizado;

public interface ClienteController {
    public Boolean IdentifyByMatricula(String matricula);

    public Estacionamiento generarEstacionamiento(String matricula);


    public boolean pagarEstacionamiento(String metodoPago);

    public EstacionamientoFinalizado finalizarestacionamiento(String matricula);
}
