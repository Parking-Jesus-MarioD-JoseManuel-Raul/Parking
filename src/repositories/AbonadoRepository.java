package repositories;

import model.*;

import java.util.ArrayList;

public interface AbonadoRepository {

    /**
     * Este metodo utilizará los datos del objeto cliente que recibe por parametro y el tipo bono introducido para generar un nuevo objeto del tipo Abonado.
     *
     * @param cliente; Objeto de cliente con los datos para comprar el bono.
     * @param bono;    Nombre del bono que se le va a asignar/comprar a ese cliente.
     * @return un nuevo objeto de tipo Abonado.
     */
    public Abonado comprarBono(Cliente cliente, String bono);

    /**
     * Este metodo será llamado dentro del metodo de comprarBono en algún momento de su ejecución.
     * Este metodo al ser llamado durante la ejecución de otro metodo se le pasarán los datos de los clientes de forma directa(no es necesario descomponer el objeto nuevamente).
     * Este metodo no tiene ningún retorno por qué ya lo tiene el metodo de "comparBono" pero si tiene que cambiar el parametro de estado del objeto Bono que se genere.
     *
     * @param metodoPago; metodo de pago del cliente usado para pagar el bono
     * @param Bono;       nombre del bono que se va a pagar
     */
    public void pagarBono(String metodoPago, Bono Bono);

    /**
     * Este metodo buscará en la lista de Clientes cuáles son los abonados que tienen el bono introducido.
     * Y los devolvera en un ArrayList o una lista de objetos del tipo Abonado.
     *
     * @param bono;
     * @return ArrayList de tipo Abonado o lista de objetos Abonado;
     */
    public ArrayList<Abonado> getAbonados(String bono);

    /**
     * Este metodo recibe un objeto de tipo cliente que será un Abonado, comprobara si el bono que tiene está caducado o todavía está vigente.
     * En caso de que el metodo retorne false significa que el bono está caducado (Se finaliza su Estacionamiento) y tendra que generar un nuevo estacionamiento normal para poder abandonar el parking.
     * Si retorna true podrá entrar o salir sin ningún problema.
     *
     * @param clienteAbonado; (Este objeto es el retorno del metodo "IdentifyByMatricula" que pertenece al Cliente).
     * @return true / false en funcion de sí su bono ha caducado o sigue vigente.
     */
    public boolean comprobarEstadoBono(Abonado clienteAbonado);

    /**
     * Si el metodo de comprobarEstacionamiento devuelve false este metodo debera finalizar el estacionamiento generando asi un nuevo objeto de EstacionamientoFinalizado que tendra los datos del estacionamiento generado por el abonado, pero su parametro de statusEstacionamiento está en falso indicando asi que el estacionamiento ha finalizado
     *
     * @param clienteAbonado
     * @return un nuevo Objeto de Estacionamiento FInalizado.
     */
    public EstacionamientoFinalizado finalizarEstacionamientoAbonado(Abonado clienteAbonado);

    /**
     * Este metodo generará un nuevo Estacionamiento para el abonado en funcion del resultado del metodo que comprueba si su bono está caducado o no y han transcurrido los 20 min de gracia que se le asignan al finalizar el bono.
     * Si estando el bono caducado se superan los 20 min de gracia que se le asignan el cliente abonado.
     * Este tendra que generar un nuevo estacionamiento comprendido entre la hora en la que finalizo su bono y el inicio del nuevo estacionamiento (al generar un nuevo estacionamiento se le asignan otros 20 min de cortesía).
     * (si se vuelve a superar el perido de cortesía tendra que generar otro estacionamiento, pero esta vez estará compuesto por la hora en la que finalizo el anterior estacionamiento y el nuevo estacionamiento).
     *
     * @return Nuevo objeto del tipo Estacionamiento
     */
    public Estacionamiento generarNuevoEstacionamientoAbonado(Abonado clienteAbonado);
}
