package repositories;

import model.Cliente;

public interface ClienteRpository {
    public Cliente getClientes(String identificador);

    public Cliente IdentifyByMatricula(String matricula);
}
