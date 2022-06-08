package objectMother;

import model.Cliente;
import model.Identificador;
import model.Plaza;
import model.Socio;

import java.util.ArrayList;

public class SocioOM {
    public static ArrayList<Socio> getSocios() {
        Identificador[] identificator = {Identificador.Bono_Socio, Identificador.Bono_Socio, Identificador.Bono_Socio};

        String[] plate = {"124HYT", "842YRO", "942UER"};

        String[] payMethod = {"012741902392", "012364812334", "235212561346"};
        ArrayList<Cliente> listaClientes = ClienteOM.getClientes();
        ArrayList<Socio> clientesSocio = new ArrayList<>();
        ArrayList<Plaza> listaPlazas = PlazaOM.getPlazas();
        for (int i = 0; i < listaClientes.size(); i++) {
            clientesSocio.add(new Socio(listaClientes.get(i).getIdentificador(), listaClientes.get(i).getMatricula(), payMethod[i], listaPlazas.get(i)));
        }

        return clientesSocio;
    }
}
