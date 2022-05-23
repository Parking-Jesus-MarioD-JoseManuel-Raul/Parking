package repositories;

import model.Plaza;

public interface PlazaRepository {
    public Plaza getEstadoPlaza(int numeroPlaza);
    public Plaza getOcupated();
    public Plaza getFree();
}
