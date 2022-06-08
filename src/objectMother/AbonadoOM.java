package objectMother;

import model.*;

import java.util.ArrayList;
import java.util.Random;

public class AbonadoOM {
    public static ArrayList<Abonado> getListaAbonados() {
        Random random = new Random();
        ArrayList<Abonado> listaAbonados = new ArrayList<>();
        ArrayList<Cliente> clientes = ClienteOM.getClientes();
        ArrayList<Bono> listaBonos = BonoOM.getBonosList();
        ArrayList<Estacionamiento> estacionamientos = (ArrayList<Estacionamiento>) EstacionamientoOM.getEstacionamiento();
        for (int i = 0; i < 8; i++) {
            listaAbonados.add(new Abonado(Identificador.Plastico, clientes.get(i).getMatricula(), clientes.get(i).getPayMethod(), listaBonos.get(random.nextInt(3)), estacionamientos.get(random.nextInt(estacionamientos.size()))));
        }

        return listaAbonados;
    }
}
