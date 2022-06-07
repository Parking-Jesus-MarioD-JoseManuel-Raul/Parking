package objectMother;

import model.Cliente;
import model.Identificador;

import java.util.ArrayList;

public class ClienteOM {
    public static ArrayList<Cliente> getClientes() {
        Identificador[] identificator = {Identificador.Bono_Socio, Identificador.Bono_Socio, Identificador.Bono_Socio, Identificador.Carton, Identificador.Carton, Identificador.Carton, Identificador.Plastico, Identificador.Plastico, Identificador.Plastico};

        String[] plate = {"124HYT", "842YRO", "942UER", "154OPS", "353JSF", "812JQA", "123FAE", "OIO125", "031OOD"};

        String[] payMethod = {"012741902392", "012364812334", "235212561346", "95135723512", "012948125712", "114668133145", "123456789014", "124515124124", "098765432135"};

        ArrayList<Cliente> clientes = new ArrayList<>();

        for (int i = 0; i < plate.length; i++) {
            clientes.add(new Cliente(identificator[i], plate[i], payMethod[i]));
        }

        return clientes;
    }

}
