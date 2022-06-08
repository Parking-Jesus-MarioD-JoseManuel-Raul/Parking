package repositoriesIMPL;

import model.Cliente;
import model.Estacionamiento;
import model.EstacionamientoFinalizado;
import model.Identificador;
import objectMother.ClienteOM;
import repositories.ClienteRpository;
import repositories.EstacionamientosRepository;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepositoryIMPL implements ClienteRpository {
	List<Cliente> clientes = ClienteOM.getClientes();

	@Override
	public ArrayList<Cliente> getClientes(String identificador) {
		ArrayList<Cliente> clientesBuscados = new ArrayList<>();

		for (Cliente cliente : clientes) {

			if (Identificador.valueOf(identificador).equals(cliente.getIdentificador())) {
				clientesBuscados.add(cliente);
			}
		}
		return clientesBuscados;
	}

	@Override
	public Boolean IdentifyByMatricula(String matricula) {
		Boolean bandera = false;
		for (Cliente cliente : clientes) {
			if (cliente.getMatricula().equals(matricula)) {
				bandera = true;
				return bandera;
			}
		}
		if (bandera==false) {
			EstacionamientoRepositoryIMPL.listaDeEstacionamiento.add(generarEstacionamiento(matricula));
			
		}
		return bandera;
	}

	@Override
	public Estacionamiento generarEstacionamiento(String matricula) {
		Estacionamiento newEstacionamiento = new Estacionamiento(LocalDateTime.now(), matricula);
		return newEstacionamiento;
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
