package controllers;

import model.Estacionamiento;
import model.EstacionamientoFinalizado;

import java.util.ArrayList;

public interface EstacionamientosController {
    public ArrayList<Estacionamiento> getEstacionamientosOperativos();

    public ArrayList<EstacionamientoFinalizado> getEstacionamientosFinalizados();
}
