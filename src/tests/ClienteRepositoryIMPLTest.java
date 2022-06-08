package tests;

import model.Abonado;
import model.Cliente;
import model.Estacionamiento;
import model.Identificador;
import objectMother.AbonadoOM;
import objectMother.ClienteOM;
import objectMother.SocioOM;
import org.junit.Ignore;
import org.junit.Test;
import repositoriesIMPL.ClienteRepositoryIMPL;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * ClienteRepositoryIMPL Tester.
 *
 * @author <Mario DurÃ¡n>
 * @version 1.0
 * @since <pre>jun. 1, 2022</pre>
 */
public class ClienteRepositoryIMPLTest {

    /**
     * Method: getClientes(String identificador)
     */
    @Test
    public void testGetClientes() {
        ClienteRepositoryIMPL clientes = new ClienteRepositoryIMPL();

        List<Cliente> espactedNotEquals = ClienteOM.getClientes();
        List<Cliente> result2 = clientes.getClientes("Bono_Socio");
        assertNotEquals(espactedNotEquals, result2);

        //||||||||||||||||||||BAJO REVISIÓN|||||||||||||||||||||
        List<Cliente> espectedNotEqualsAB = ClienteOM.getClientes();
        List<Cliente> result4 = clientes.getClientes("Carton");
        assertEquals(espectedNotEqualsAB, result4);
    }

    /**
     * Method: IdentifyByMatricula(String matricula)
     */
    @Test
    public void testIdentifyByMatricula() {
        ClienteRepositoryIMPL clientes = new ClienteRepositoryIMPL();
        
         Boolean result = clientes.IdentifyByMatricula("124HYT");
         assertTrue(result);
         
         Boolean result2 = clientes.IdentifyByMatricula("740OIE");
         assertFalse(result2);
    }

    /**
     * Method: genrarEstacionamiento(String matricula)
     */
    @Test
    public void testGenrarEstacionamiento() {
        ClienteRepositoryIMPL clientes = new ClienteRepositoryIMPL();

        Estacionamiento spected = new Estacionamiento(LocalDateTime.now(), "124HYT");
        Estacionamiento result = clientes.generarEstacionamiento("124HYT");
        assertEquals(spected.getMatricula(), result.getMatricula());

        Estacionamiento spected2 = new Estacionamiento(LocalDateTime.now(), "124HYT");
        Estacionamiento result2 = clientes.generarEstacionamiento("987MTS");
        assertNotEquals(spected2.getMatricula(), result2.getMatricula());

    }

    /**
     * Method: pagarEstacionamiento(String metodoPago)
     */
    @Test
    public void testPagarEstacionamiento() {

    }

    /**
     * Method: finalizarEstacionamiento(String matricula)
     */
    @Test
    public void testFinalizarEstacionamiento() {

    }
} 
