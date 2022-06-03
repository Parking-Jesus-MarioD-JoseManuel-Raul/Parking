package controllers;

import model.*;

import java.util.ArrayList;

public interface AbonadoController {
    public Abonado comprarBono(Cliente cliente, String bono);

    public void pagarBono(String metodoPago, Bono Bono);

    public ArrayList<Abonado> getAbonados(String bono);

    public boolean comprobarEstadoBono(Abonado clienteAbonado);

    public EstacionamientoFinalizado finalizarEstacionamientoAbonado(Abonado clienteAbonado);

    public Estacionamiento generarNuevoEstacionamientoAbonado(Abonado clienteAbonado);
}
