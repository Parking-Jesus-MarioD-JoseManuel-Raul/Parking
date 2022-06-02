package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import model.Cliente;
import model.Identificador;
import objectMother.ClienteOM;
import repositories.ClienteRpository;
import repositoriesIMPL.ClienteRepositoryIMPL;

/**
 * ClienteRepositoryIMPL Tester.
 *
 * @author <Jesus Macarro>
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
    	List<Cliente> spected = ClienteOM.getSocios();
    	List<Cliente> result = clientes.getClientes("Bono_Socio");
    	assertEquals(spected, result );
    	
    	List<Cliente> spected2 = ClienteOM.getEsporadicos();
    	List<Cliente> result2 = clientes.getClientes("Bono_Socio");
    	assertNotEquals(spected2, result2 );
    	
    	List<Cliente> spected3 = ClienteOM.getAbonados();
    	List<Cliente> result3 = clientes.getClientes("Plastico");
    	assertEquals(spected3, result3 );
    }

    /**
     * Method: IdentifyByMatricula(String matricula)
     */
    @Test
    public void testIdentifyByMatricula() {

    }

    /**
     * Method: genrarEstacionamiento(String matricula)
     */
    @Test
    public void testGenrarEstacionamiento() {

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
