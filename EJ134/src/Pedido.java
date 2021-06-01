import java.util.Date;
import java.util.List;

public class Pedido
{

    private String codigoCliente;
    public List<Entrega> entregas;
    public Integer cantEntregas;
    private String idPedido;
    public Date fechaInicial;

    public Pedido(String codCli, Integer cantEntregas, Date fechaInicial)
    {
        this.codigoCliente = codCli;
        this.cantEntregas = cantEntregas;
        this.fechaInicial = fechaInicial;

    }

    public void agregarEntrega(Entrega entrega)
    {
        entregas.add(entrega);
    }

    public String finalizarPedido()
    {
        return idPedido;
    }

    public void agregarEntregas(List<Entrega> entregas) {
        this.entregas.addAll(entregas);
    }

    public Date fechaInicial() {
        return this.fechaInicial;
    }
}
