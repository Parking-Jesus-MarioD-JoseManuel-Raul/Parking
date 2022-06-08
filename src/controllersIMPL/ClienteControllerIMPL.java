package controllersIMPL;

import controllers.ClienteController;
import model.Estacionamiento;
import model.EstacionamientoFinalizado;
import repositories.ClienteRpository;

public class ClienteControllerIMPL implements ClienteController {
    ClienteRpository clienteRpository;

    @Override
    public Boolean IdentifyByMatricula(String matricula) {
        return clienteRpository.IdentifyByMatricula(matricula);
    }

    @Override
    public Estacionamiento generarEstacionamiento(String matricula) {
        return clienteRpository.generarEstacionamiento(matricula);
    }

    @Override
    public boolean pagarEstacionamiento(String metodoPago) {
        return clienteRpository.pagarEstacionamiento(metodoPago);
    }

    @Override
    public EstacionamientoFinalizado finalizarestacionamiento(String matricula) {
        return clienteRpository.finalizarEstacionamiento(matricula);
    }
}
