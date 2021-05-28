import java.util.Date;
import java.util.List;

public class UICliente
{
    private String codCli;
    private List<Pedido> pedidos;

    public void nuevoPedido(String codCli, Date primerEntrega,Integer cantEntregas,Peridiocidad periodo)
    {
        Pedido ped = new Pedido(codCli,cantEntregas,periodo,primerEntrega);
        List<Date> listaFechas = ped.calcularFechasDeEntrega();
        listaFechas.forEach(fecha->this.nuevaEntrega(ped,fecha));
        pedidos.add(ped);
    }
    public void nuevaEntrega(Pedido pedido,Date fecha)
    {
        List<Item> items;
        //CICLO DE AGREGACION DE ITEMS
        /*
        itemNuevo = readLine(); "BarraAcero"
        items.add(itemNuevo)
        */
        Entrega entre = new Entrega(fecha,items);
        pedido.agregarEntrega(entre);

    }
}