package repositories;

import model.Abonado;

public interface AbonadoRepository {
    public Abonado getAbonados(String bono);
    public Abonado filtyeredByMatricula(String Matricula);
}
