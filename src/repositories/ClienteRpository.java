package repositories;

import model.Cliente;
import model.Estacionamiento;
import model.EstacionamientoFinalizado;

import java.util.ArrayList;

public interface ClienteRpository {

    /**
     * Este metodo buscará en la lista de Clientes los clientes que tengan el tipo de identificador introducido.
     * Y los devolverá en un ArrayList o lista de objetos del tipo Cliente.
     *
     * @param identificador;
     * @return Lista de clientes que coincidan con el identificador introducido;
     */

    public ArrayList<Cliente> getClientes(String identificador);


    /**
     * Este metodo de identificar por matrícula buscará en la lista de clientes un cliente
     * culla matrícula coincida con la matrícula introducida por parametro.
     * El metodo debe devolver true o false en fución de sí se cumple o no esta condicion.
     * Si el metodo no encuentra ninguna coincidencia, se generará un nuevo estacionamiento con esta matrícula.
     *
     * @param matricula; Matrícula introducida para realizar la búsqueda
     * @return true o false en fución de sí se cumple o no la condicion.
     */

    public Boolean IdentifyByMatricula(String matricula);


    /**
     * Este metodo será llamado en caso de que el metodo de identificar matrículas no encuentre ninguna coincidencia.
     * A demás el parametro de matrícula de este metodo es una reutilización del parametro matrícula del metodo de buscar por matrículas.
     *
     * @param matricula; Matricula necesaria para generar el estacionamiento
     * @return ; Un objeto de tipo Estacionamiento (usando datos por ahora inventados);
     */

    public Estacionamiento generarEstacionamiento(String matricula);


    /**
     * Este metodo se encargara de efectuar el pago del estacionamiento asociado a una matrícula.(si no hay ningún estacionamiento asociado a esta matrícula se mostrara un mensaje de error informando al cliente).
     *
     * @param metodoPago; Metodo de pago de la persona que genero el estacionamiento para efectuar el pago.
     * @return true/false; Devolvera true si el pago se ha efectuado y false si no se ha podido efectuar el pago
     */

    public boolean pagarEstacionamiento(String metodoPago);


    /**
     * En el caso de que el metodo de pagar estacionamiento devuelva true, este metodo generara un nuevo objeto de estacionamientoFinalizado con los datos del estacionamiento asociado a la matricula introducida.
     * (si valor de "statusEstacionamiento" está en true significa que está en curso, si está en falso significa que está finalizado)
     * Para generar este nuevo objeto hay que usar el metodo "setStatusEstacionamiento" y darle valor a falso para indicar que el estacionamiento está finalizado
     *
     * @param matricula; Para buscar el estacionamiento asociado a esa matrícula.
     * @return ; Un objeto de la clase EstacionamientoFinalizado.
     */

    public EstacionamientoFinalizado finalizarEstacionamiento(String matricula);
}
