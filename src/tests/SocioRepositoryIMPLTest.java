package tests;

import model.Identificador;
import model.Plaza;
import model.Socio;
import org.junit.Ignore;
import org.junit.Test;
import repositoriesIMPL.SocioRepositoryIMPL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * SocioRepositoryIMPL Tester.
 *
 * @author <Raúl Durán>
 * @version 1.0
 * @since <pre>jun. 1, 2022</pre>
 */
public class SocioRepositoryIMPLTest {

    /**
     * Method: findSociobyMatricula(String matricula)
     */
    @Test
    public void testFindSociobyMatricula() {
        SocioRepositoryIMPL socios = new SocioRepositoryIMPL();
        Plaza plaza = new Plaza(007, true, 22);

        Socio spected = new Socio(Identificador.Bono_Socio, "123MNW", "83715326", plaza);
        Socio result = socios.findSociobyMatricula("123MNW");
        assertEquals(spected, result);

        Socio spectedErr = new Socio(Identificador.Bono_Socio, "123MNW", "83715326", plaza);
        Socio resultErr = socios.findSociobyMatricula("873NNN");
        assertNotEquals(spectedErr, resultErr);
    }

    /**
     * Method: darseDeBajaSocio()
     */
    @Ignore
    public void testDarseDeBajaSocio() {


    }

    /**
     * Method: modificarDatosSocio()
     */
    @Ignore
    public void testModificarDatosSocio() {
//TODO: Test goes here... 
    }

}
