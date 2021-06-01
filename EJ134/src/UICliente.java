import java.util.*;

public class UICliente
{

    public void nuevoPedido(String codCliente, Date fechaPrimerEntrega, Integer cantEntregas, Periodicidad periodicidad)
    {
        Pedido pedido = new Pedido(codCliente, cantEntregas, fechaPrimerEntrega);
        PlanificadorEntregas planificadorEntregas = new PlanificadorEntregas(periodicidad, pedido);
        List<Entrega> entregas = planificadorEntregas.calcularEntregas();

        this.asignarArticulosAEntregas(entregas);

        pedido.agregarEntregas(entregas);

        this.mostrarPedido();

    }

    private void mostrarPedido() {
        //Ya finalizado el pedido podria mostrarselo al usuario para que lo corrobore
        //Y finalmente muestra su identificador
    }

    private void asignarArticulosAEntregas(List<Entrega> entregas) {

        //En esta parte el usuario debería poder visualizar las entregas
        //Y para cada una de ellas ir agregando los articulos segun desee
        //Esto incluye tolerancias, cantidades y envases

    }

}