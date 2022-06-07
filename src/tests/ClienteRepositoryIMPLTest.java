package tests;

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
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * ClienteRepositoryIMPL Tester.
 *
 * @author <Mario Durán>
 * @version 1.0
 * @since <pre>jun. 1, 2022</pre>
 */
public class ClienteRepositoryIMPLTest {

    /**
     * Method: getClientes(String identificador)
     */
    @Ignore
    public void testGetClientes() {
        ClienteRepositoryIMPL clientes = new ClienteRepositoryIMPL();

        List<Cliente> espectedSocios = SocioOM.getSocios();
        List<Cliente> result = clientes.getClientes("Bono_Socio");
        assertEquals(espectedSocios, result);

        List<Cliente> espactedNotEquals = ClienteOM.getClientes();
        List<Cliente> result2 = clientes.getClientes("Bono_Socio");
        assertNotEquals(espactedNotEquals, result2);

        List<Cliente> espectedAbonados = AbonadoOM.getAbonados();
        List<Cliente> result3 = clientes.getClientes("Plastico");
        assertEquals(espectedAbonados, result3);
        
        //||||||||||||||||||||SUJETO A REVISION||||||||||||||||||||||
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
    	
    	Cliente spected = new Cliente(Identificador.Bono_Socio, "124HYT", "012741902392" );
    	Cliente result = clientes.IdentifyByMatricula("124HYT");
    	assertEquals(spected, result );
    	
    	Cliente spected2 = new Cliente(Identificador.Bono_Socio, "124HYT", "012741902392" );
    	Cliente result2 = clientes.IdentifyByMatricula("012JRE");
    	assertNotEquals(spected2, result2 );
    }

    /**
     * Method: genrarEstacionamiento(String matricula)
     */
    @Ignore
    public void testGenrarEstacionamiento() {
    	ClienteRepositoryIMPL clientes = new ClienteRepositoryIMPL();
    	
    	Estacionamiento spected = new Estacionamiento(LocalDateTime.now(), "124HYT");
    	Estacionamiento result = clientes.generarEstacionamiento("124HYT");
    	assertEquals(spected, result);
    	
    	Estacionamiento spected2 = new Estacionamiento(LocalDateTime.now(), "124HYT");
    	Estacionamiento result2 = clientes.generarEstacionamiento("987MTS");
    	assertNotEquals(spected2, result2);

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
