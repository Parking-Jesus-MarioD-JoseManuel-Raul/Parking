package controllersIMPL;

import controllers.GenerarEstacionamientoController;
import model.Estacionamiento;
import repositories.ClienteRpository;

public class GenerarEstacionamientoControllerIMPL implements GenerarEstacionamientoController {
    ClienteRpository clienteRpository;

    @Override
    public Estacionamiento genrarEstacionamiento(String matricula) {
        return clienteRpository.generarEstacionamiento(matricula);
    }
}
