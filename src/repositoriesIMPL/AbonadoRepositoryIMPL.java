package repositoriesIMPL;

import model.*;
import repositories.AbonadoRepository;

import java.util.ArrayList;

public class AbonadoRepositoryIMPL implements AbonadoRepository {
    
    @Override
    public Abonado comprarBono(Cliente cliente, String bono) {
        return null;
    }

    @Override
    public void pagarBono(String metodoPago, Bono Bono) {
    }

    @Override
    public ArrayList<Abonado> getAbonados(String bono) {
        return null;
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
