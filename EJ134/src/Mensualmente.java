import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Mensualmente implements Peridiocidad
{
    public List<Date> fechasEntrega(Pedido pedidoCliente)
    {
        Date primerEntrega = pedidoCliente.fechaInicial;
        List<Date> entregaMensual;
        for (int i = 0; i < pedidoCliente.cantEntregas; i++)
        {
            sumarDiasAFecha(primerEntrega,7);
            entregaMensual.add(primerEntrega);
        }
        return entregaMensual;
    }

    public static Date sumarDiasAFecha(Date fecha, int dias){
        if (dias==0) return fecha;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.DAY_OF_YEAR, dias);
        return calendar.getTime();
    }
}
