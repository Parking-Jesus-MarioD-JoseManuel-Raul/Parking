package repositoriesIMPL;

import model.Cliente;
import model.Estacionamiento;
import model.EstacionamientoFinalizado;
import repositories.ClienteRpository;

import java.util.ArrayList;

public class ClienteRepositoryIMPL implements ClienteRpository {
    @Override
    public ArrayList<Cliente> getClientes(String identificador) {
        return null;
    }

    @Override
    public Cliente IdentifyByMatricula(String matricula) {
        return null;
    }

    @Override
    public Estacionamiento generarEstacionamiento(String matricula) {
        return null;
    }

    @Override
    public boolean pagarEstacionamiento(String metodoPago) {

        return false;
    }

    @Override
    public EstacionamientoFinalizado finalizarEstacionamiento(String matricula) {
        return null;
    }

}
