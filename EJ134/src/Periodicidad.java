import java.util.Date;
import java.util.List;

public interface Periodicidad
{
    List<Date> fechasEntrega(Pedido pedidoCliente);
}
