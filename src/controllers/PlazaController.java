package controllers;

import model.Plaza;

import java.util.ArrayList;

public interface PlazaController {
    public boolean getEstadoPlaza(int numeroPlaza);

    public ArrayList<Plaza> getOcupated();

    public ArrayList<Plaza> getFree();
}
