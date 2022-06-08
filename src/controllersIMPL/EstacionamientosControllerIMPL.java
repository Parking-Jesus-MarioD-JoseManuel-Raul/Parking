package controllersIMPL;

import controllers.EstacionamientosController;
import model.Estacionamiento;
import model.EstacionamientoFinalizado;
import repositories.EstacionamientosRepository;

import java.util.ArrayList;

public class EstacionamientosControllerIMPL implements EstacionamientosController {
    EstacionamientosRepository estacionamientosRepository;

    @Override
    public ArrayList<Estacionamiento> getEstacionamientosOperativos() {
        return estacionamientosRepository.getEstacionamientosOperativos();
    }

    @Override
    public ArrayList<EstacionamientoFinalizado> getEstacionamientosFinalizados() {
        return estacionamientosRepository.getEstacionamientosFinalizados();
    }
}
