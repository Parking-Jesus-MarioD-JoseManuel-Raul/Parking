package controllers;

import model.Socio;

public interface SocioController {

    public Socio findSociobyMatricula(String matricula);

    public void darseDeBajaSocio();

    public void modificarDatosSocio();
}
