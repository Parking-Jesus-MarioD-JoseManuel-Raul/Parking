package controllersIMPL;

import controllers.IdentifyByMatriculaController;
import model.Cliente;
import repositories.ClienteRpository;

public class IdentifyByMatriculaIMPL implements IdentifyByMatriculaController {
    private ClienteRpository clienteRpository;

    @Override
    public Cliente IdentifyByMatricula(String matricula) {
        return clienteRpository.IdentifyByMatricula(matricula);
    }
}
