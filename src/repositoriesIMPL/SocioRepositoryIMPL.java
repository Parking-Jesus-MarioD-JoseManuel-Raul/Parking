package repositoriesIMPL;

import java.util.ArrayList;

import model.Socio;
import repositories.SocioRepository;

public class SocioRepositoryIMPL implements SocioRepository {

ArrayList<Socio> listaSocios = new ArrayList<>();
    @Override
    public Socio findSociobyMatricula(String matricula) {
    	Socio socioBuscado = null;
    	for (Socio socio : listaSocios) {
			if(socio.getMatricula().equals(matricula)) {
				socioBuscado = socio;
			}
		}
		return socioBuscado;
    }

    @Override
    public void darseDeBajaSocio() {

    }

    @Override
    public void modificarDatosSocio() {

    }

}
