import java.util.List;
import java.util.stream.Collectors;

public class PlanificadorEntregas {

    private Periodicidad periodicidad;
    private Pedido pedido;

    public PlanificadorEntregas(Periodicidad periodicidad, Pedido pedido) {
        this.pedido = pedido;
        this.periodicidad = periodicidad;
    }

    public List<Entrega> calcularEntregas() {
        return this.periodicidad.fechasEntrega(pedido)
                .stream().map(fechaEntrega -> new Entrega(fechaEntrega))
                .collect(Collectors.toList());
    }
}
