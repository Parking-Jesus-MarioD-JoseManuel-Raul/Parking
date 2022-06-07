package tests;

import model.Abonado;
import model.Bono;
import model.Cliente;
import model.Estacionamiento;
import objectMother.ClienteOM;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import repositoriesIMPL.AbonadoRepositoryIMPL;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * AbonadoRepositoryIMPL Tester.
 *
 * @author <Jesús Macarro>
 * @version 1.0
 * @since <pre>jun. 1, 2022</pre>
 */
public class AbonadoRepositoryIMPLTest {
    AbonadoRepositoryIMPL abonadoRepositoryIMPL = new AbonadoRepositoryIMPL();

    /**
     * Method: comprarBono(Cliente cliente, String bono)
     */
    @Test
    public void testComprarBono() {
        ArrayList<Cliente> clientes = ClienteOM.getClientes();
        Cliente cliente = clientes.get(0);
        Estacionamiento estacionamiento = new Estacionamiento(LocalDateTime.now(), cliente.getMatricula());
        Bono bono = new Bono("Diario", LocalDate.now(), LocalDate.now().plusDays(1), 15.00);

        Abonado spectedAbonado = new Abonado(cliente.getIdentificador(), cliente.getMatricula(), cliente.getPayMethod(), bono, estacionamiento);
        Abonado abonadoResultado = abonadoRepositoryIMPL.comprarBono(cliente, "Diario");
        Assertions.assertEquals(spectedAbonado, abonadoResultado);


    }

    /**
     * Method: pagarBono(String metodoPago, Bono Bono)
     */
    @Test
    public void testPagarBono() {
//TODO: Test goes here... 
    }

    /**
     * Method: getAbonados(String bono)
     */
    @Test
    public void testGetAbonados() {
//TODO: Test goes here... 
    }

    /**
     * Method: comprobarEstadoBono(Abonado clienteAbonado)
     */
    @Test
    public void testComprobarEstadoBono() {
//TODO: Test goes here... 
    }

    /**
     * Method: finalizarEstacionamientoAbonado(Abonado clienteAbonado)
     */
    @Test
    public void testFinalizarEstacionamientoAbonado() {
//TODO: Test goes here... 
    }

    /**
     * Method: generarNuevoEstacionamientoAbonado(Abonado clienteAbonado)
     */
    @Test
    public void testGenerarNuevoEstacionamientoAbonado() {
//TODO: Test goes here... 
    }


} 
