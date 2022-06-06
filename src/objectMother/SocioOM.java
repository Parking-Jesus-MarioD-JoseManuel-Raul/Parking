package objectMother;

import model.Cliente;
import model.Identificador;

import java.util.ArrayList;
import java.util.List;

public class SocioOM {
	public static List<Cliente> getSocios() {
		Identificador[] identificator = { Identificador.Bono_Socio, Identificador.Bono_Socio,
				Identificador.Bono_Socio };

		String[] plate = { "124HYT", "842YRO", "942UER" };

		String[] payMethod = { "012741902392", "012364812334", "235212561346" };

		ArrayList<Cliente> clientes = new ArrayList<>();

		for (int i = 0; i < plate.length; i++) {
			clientes.add(new Cliente(identificator[i], plate[i], payMethod[i]));
		}

		return clientes;
	}
}
