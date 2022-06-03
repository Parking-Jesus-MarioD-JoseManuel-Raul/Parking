package controllersIMPL;

import controllers.AbonadoController;
import model.*;
import repositories.AbonadoRepository;

import java.util.ArrayList;

public class AbonadoControllerIMPL implements AbonadoController {
    AbonadoRepository abonadoRepository;

    @Override
    public Abonado comprarBono(Cliente cliente, String bono) {
        return abonadoRepository.comprarBono(cliente, bono);
    }

    @Override
    public void pagarBono(String metodoPago, Bono Bono) {
        abonadoRepository.pagarBono(metodoPago, Bono);
    }

    @Override
    public ArrayList<Abonado> getAbonados(String bono) {
        return abonadoRepository.getAbonados(bono);
    }

    @Override
    public boolean comprobarEstadoBono(Abonado clienteAbonado) {
        return abonadoRepository.comprobarEstadoBono(clienteAbonado);
    }

    @Override
    public EstacionamientoFinalizado finalizarEstacionamientoAbonado(Abonado clienteAbonado) {
        return abonadoRepository.finalizarEstacionamientoAbonado(clienteAbonado);
    }

    @Override
    public Estacionamiento generarNuevoEstacionamientoAbonado(Abonado clienteAbonado) {
        return abonadoRepository.generarNuevoEstacionamientoAbonado(clienteAbonado);
    }
}
