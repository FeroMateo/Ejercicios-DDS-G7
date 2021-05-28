import java.util.Date;
import java.util.List;

public class Pedido
{

    private String codigoCliente;
    public List<Entrega> entregas;
    public Integer cantEntregas;
    private Peridiocidad periodo;
    private String idPedido;
    public Date fechaInicial;

    public Pedido(String codCli, Integer cantEntregas, Peridiocidad periodo, Date fechaInicial)
    {
        codigoCliente = codCli;
        this.cantEntregas = cantEntregas;
        this.periodo = periodo;
        this.fechaInicial = fechaInicial;

    }

    public List<Date> calcularFechasDeEntrega()
    {
        return periodo.fechasEntrega(this);
    }
    public void agregarEntrega(Entrega entrega)
    {
        entregas.add(entrega);
    }

    public String finalizarPedido()
    {
        return idPedido;
    }
}
