package repositoriesIMPL;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.Socio;
import objectMother.SocioOM;
import repositories.SocioRepository;

public class SocioRepositoryIMPL implements SocioRepository {

	List<Cliente> listaSocios = new List<>();

	@Override
	public Socio findSociobyMatricula(String matricula) {
		Socio socioBuscado = null;
		listaSocios = SocioOM.getSocios();
		for (Socio socio : listaSocios) {
			if (socio.getMatricula().equals(matricula)) {
				socioBuscado = socio;
			}
		}
		return socioBuscado;
	}

	@Override
	public void darseDeBajaSocio(String matricula) {
		Socio socioBuscando = findSociobyMatricula(matricula);
		for (Socio socio : listaSocios) {
			if (socioBuscando.equals(socio)) {
				listaSocios.remove(socio);
			}
		}
	}

	@Override
	public void modificarDatosSocio() {

	}

}
