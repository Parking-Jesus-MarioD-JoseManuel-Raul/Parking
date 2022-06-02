package repositories;

import model.Estacionamiento;
import model.EstacionamientoFinalizado;

import java.util.ArrayList;

public interface EstacionamientosRepository {
    public ArrayList<Estacionamiento> getEstacionamientosOperativos();

    public ArrayList<EstacionamientoFinalizado> getEstacionamientosFinalizados();

}
