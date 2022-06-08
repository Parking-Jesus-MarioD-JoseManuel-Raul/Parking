package controllersIMPL;

import controllers.PlazaController;
import model.Plaza;
import repositories.PlazaRepository;

import java.util.ArrayList;

public class PlazaControllerIMPL implements PlazaController {
    PlazaRepository plazaRepository;

    @Override
    public boolean getEstadoPlaza(int numeroPlaza) {
        return plazaRepository.getEstadoPlaza(numeroPlaza);
    }

    @Override
    public ArrayList<Plaza> getOcupated() {
        return plazaRepository.getOcupated();
    }

    @Override
    public ArrayList<Plaza> getFree() {
        return plazaRepository.getFree();
    }
}
