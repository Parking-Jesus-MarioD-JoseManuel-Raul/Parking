package repositories;

import model.Socio;

public interface SocioRepository {
    public Socio findSociobyMatricula(String matricula);

}
