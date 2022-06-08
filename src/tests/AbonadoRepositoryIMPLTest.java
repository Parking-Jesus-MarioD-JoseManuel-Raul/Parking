package tests;

import model.Abonado;
import model.Bono;
import model.Cliente;
import model.Estacionamiento;
import objectMother.AbonadoOM;
import objectMother.ClienteOM;
import org.junit.Test;
import repositoriesIMPL.AbonadoRepositoryIMPL;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(spectedAbonado, abonadoResultado);
    }

    /**
     * Method: pagarBono(String metodoPago, Bono Bono)
     */
    @Test
    public void testPagarBono() {
        ArrayList<Abonado> clientesAbonados = AbonadoOM.getListaAbonados();
        Abonado clienteAbonado = clientesAbonados.get(0);
        Estacionamiento estacionamiento = new Estacionamiento(LocalDateTime.now(), clienteAbonado.getMatricula());
        Bono bono = new Bono("Diario", LocalDate.now(), LocalDate.now().plusDays(1), 15.00);
        bono.setEstadoBonoPagado();
        Abonado spectedAbonado = new Abonado(clienteAbonado.getIdentificador(), clienteAbonado.getMatricula(), clienteAbonado.getPayMethod(), bono, estacionamiento);
        Abonado resultadoAbonado = abonadoRepositoryIMPL.comprarBono(clienteAbonado, "Diario");
        assertEquals(spectedAbonado, resultadoAbonado);
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
