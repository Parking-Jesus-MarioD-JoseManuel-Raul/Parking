package repositories;

import model.Plaza;

import java.util.ArrayList;

public interface PlazaRepository {

    /**
     * Busca en la lista de plaza cual coincide con el numero de plaza introducido y devuelve su estado de ocupacion
     *
     * @param numeroPlaza;
     * @return ; Estado de la palaza (ocupada o no )
     */
    public boolean getEstadoPlaza(int numeroPlaza);

    /**
     * Busca entre todas las plazas de la lista de Plazas cuales estan ocupadas y las guarda en un nuevo ArrayList.
     *
     * @return ; Un ArrayList de las plazas que están ocupadas.
     */
    public ArrayList<Plaza> getOcupated();

    /**
     * Busca entre las plazas de la lista de Plazas cuales estan sin ocupar y las guarda en un nuevo ArrayList
     *
     * @return ; ArrayList de plazas libres o no ocupadas
     */
    public ArrayList<Plaza> getFree();
}
