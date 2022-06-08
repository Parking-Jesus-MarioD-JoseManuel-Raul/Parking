package controllersIMPL;

import controllers.SocioController;
import model.Socio;
import repositories.SocioRepository;

public class SocioControllerIMPL implements SocioController {
    SocioRepository socioRepository;

    @Override
    public Socio findSociobyMatricula(String matricula) {
        return socioRepository.findSociobyMatricula(matricula);
    }

    @Override
    public void darseDeBajaSocio() {
        socioRepository.darseDeBajaSocio();
    }

    @Override
    public void modificarDatosSocio() {
        socioRepository.modificarDatosSocio();
    }
}
