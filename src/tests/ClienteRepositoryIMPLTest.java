package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.Test;

import model.Cliente;
import model.Identificador;
import objectMother.AbonadoOM;
import objectMother.ClienteOM;
import objectMother.SocioOM;
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
    	
    	List<Cliente> spected = SocioOM.getSocios();
    	List<Cliente> result = clientes.getClientes("Bono_Socio");
    	assertEquals(spected, result );
    	
    	List<Cliente> spected2 = ClienteOM.getClientes();
    	List<Cliente> result2 = clientes.getClientes("Bono_Socio");
    	assertNotEquals(spected2, result2 );
    	
    	List<Cliente> spected3 = AbonadoOM.getAbonadoss();
    	List<Cliente> result3 = clientes.getClientes("Plastico");
    	assertEquals(spected3, result3 );
    	
    	List<Cliente> spected4 = ClienteOM.getClientes();
    	List<Cliente> result4 = clientes.getClientes("Carton");
    	assertEquals(spected4, result4);
    }

    /**
     * Method: IdentifyByMatricula(String matricula)
     */
    @Test
    public void testIdentifyByMatricula() {
    	ClienteRepositoryIMPL clientes = new ClienteRepositoryIMPL();
    	
    	Cliente spected = new Cliente(Identificador.Bono_Socio, "124HYT", "012741902392" );
    	Cliente result = clientes.IdentifyByMatricula("012741902392");
    	assertEquals(spected, result );
    	
    	Cliente spected2 = new Cliente(Identificador.Bono_Socio, "124HYT", "012741902392" );
    	Cliente result2 = clientes.IdentifyByMatricula("012741902324");
    	assertNotEquals(spected, result );
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
