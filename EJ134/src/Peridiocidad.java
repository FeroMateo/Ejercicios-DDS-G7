import java.util.Date;
import java.util.List;

public interface Peridiocidad
{
    List<Date> fechasEntrega(Pedido pedidoCliente);
}
