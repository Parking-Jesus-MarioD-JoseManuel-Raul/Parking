package repositories;

import model.Socio;

public interface SocioRepository {
    /**
     * Este metodo buscará entre la lista de Clientes el socio que coincida con esa matricula.
     *
     * @param matricula; Matricula para buscar
     * @return objeto de tipo Socio que coincida con la matricula introducida.
     */
    public Socio findSociobyMatricula(String matricula);

    /**
     * Este metodo permite al socio darse de baja como socio
     */
    public void darseDeBajaSocio(String matricula);

    /**
     * Este metodo permite modificar los datos de socio (Solo se podra cambiar su metodo de pago y su matricula)
     */
    public void modificarDatosSocio();
}
