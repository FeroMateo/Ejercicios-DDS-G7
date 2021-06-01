import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class UnicaVez implements Periodicidad
{
    public List<Date> fechasEntrega(Pedido pedidoCliente)
    {
        return Collections.singletonList(pedidoCliente.fechaInicial());
    }
}
