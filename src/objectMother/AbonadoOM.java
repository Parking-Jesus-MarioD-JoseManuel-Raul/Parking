package objectMother;

import model.Cliente;
import model.Identificador;

import java.util.ArrayList;
import java.util.List;

public class AbonadoOM {
    public static List<Cliente> getAbonados() {
        Identificador[] identificator = {Identificador.Plastico, Identificador.Plastico, Identificador.Plastico};

        String[] plate = {"123FAE", "OIO125", "031OOD"};

        String[] payMethod = {"123456789014", "124515124124", "098765432135"};

        ArrayList<Cliente> clientes = new ArrayList<>();

        for (int i = 0; i < plate.length; i++) {
            clientes.add(new Cliente(identificator[i], plate[i], payMethod[i]));
        }

        return clientes;
    }
}
