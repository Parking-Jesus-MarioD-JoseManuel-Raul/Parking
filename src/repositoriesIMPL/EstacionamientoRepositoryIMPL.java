package repositoriesIMPL;

import java.util.ArrayList;

import model.Estacionamiento;
import model.EstacionamientoFinalizado;
import objectMother.EstacionamientoOM;
import repositories.EstacionamientosRepository;

public class EstacionamientoRepositoryIMPL implements EstacionamientosRepository{
	ArrayList <Estacionamiento> listaDeEstacionamiento = EstacionamientoOM.getEstacionamiento();
	ArrayList <EstacionamientoFinalizado> listaDeEstacionamientoFinalizado = EstacionamientoOM.getEstacionamientosFinalizados();
	@Override
	public ArrayList<Estacionamiento> getEstacionamientosOperativos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<EstacionamientoFinalizado> getEstacionamientosFinalizados() {
		// TODO Auto-generated method stub
		return null;
	}

}
