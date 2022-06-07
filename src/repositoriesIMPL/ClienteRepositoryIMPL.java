package repositoriesIMPL;

import model.Cliente;
import model.Estacionamiento;
import model.EstacionamientoFinalizado;
import model.Identificador;
import objectMother.ClienteOM;
import repositories.ClienteRpository;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepositoryIMPL implements ClienteRpository {
	List<Cliente> clientes = ClienteOM.getClientes();
	
    @Override
    public ArrayList<Cliente> getClientes(String identificador) {
    	ArrayList<Cliente> clientesBuscados= new ArrayList<>();
    	
    	for (Cliente cliente : clientes) {
    										
			if (Identificador.valueOf(identificador).equals(cliente.getIdentificador())) {
				clientesBuscados.add(cliente);
			}
		}
        return clientesBuscados;
    }

    @Override
    public Cliente IdentifyByMatricula(String matricula) {
    	Cliente clienteBuscado = null;
    	for (Cliente cliente : clientes) {
			if(cliente.getMatricula().equals(matricula)) {
				clienteBuscado = cliente;
			}
		}
        return clienteBuscado;
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
