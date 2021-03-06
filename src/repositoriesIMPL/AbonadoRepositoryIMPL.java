package repositoriesIMPL;

import model.*;
import objectMother.AbonadoOM;
import repositories.AbonadoRepository;

import java.time.LocalDate;
import java.util.ArrayList;

public class AbonadoRepositoryIMPL implements AbonadoRepository {

    @Override
    public Abonado comprarBono(Cliente cliente, String bono) {
        Abonado clienteAbonado = null;
        switch (bono) {
            case "Diario": {
                clienteAbonado = new Abonado(cliente.getIdentificador(), cliente.getMatricula(), cliente.getPayMethod(), new Bono(bono, LocalDate.now(), LocalDate.now().plusDays(1), 15.00), Abonado.getDatosEstacionamiento());
            }
            break;
            case "Nocturno": {
                clienteAbonado = new Abonado(cliente.getIdentificador(), cliente.getMatricula(), cliente.getPayMethod(), new Bono(bono, LocalDate.now(), LocalDate.now().plusDays(1), 5.00), Abonado.getDatosEstacionamiento());
            }
            break;
            case "FinDeSemana": {
                clienteAbonado = new Abonado(cliente.getIdentificador(), cliente.getMatricula(), cliente.getPayMethod(), new Bono(bono, LocalDate.now(), LocalDate.now().plusDays(2), 20.00), Abonado.getDatosEstacionamiento());
            }
            break;
        }
        assert clienteAbonado != null;
        pagarBono(clienteAbonado.getPayMethod(), clienteAbonado.getBono());
        return clienteAbonado;
    }

    @Override
    public void pagarBono(String metodoPago, Bono bono) {
        bono.setEstadoBonoPagado();
    }

    @Override
    public ArrayList<Abonado> getAbonados(String bono) {
        ArrayList<Abonado> listaAbonados = AbonadoOM.getListaAbonados();
        ArrayList<Abonado> getAbonadoBono = new ArrayList<>();
        for (Abonado clienteAbonado : listaAbonados) {
            if (clienteAbonado.getBono().getNombreBono().equals(bono)) {
                getAbonadoBono.add(clienteAbonado);
            }
        }
        return getAbonadoBono;
    }

    @Override
    public boolean comprobarEstadoBono(Abonado clienteAbonado) {
        return false;
    }

    @Override
    public EstacionamientoFinalizado finalizarEstacionamientoAbonado(Abonado clienteAbonado) {
        return null;
    }

    @Override
    public Estacionamiento generarNuevoEstacionamientoAbonado(Abonado clienteAbonado) {
        return null;
    }

}
