import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

public class Semanalmente implements Periodicidad
{
   public List<Date> fechasEntrega(Pedido pedidoCliente)
   {

       Date primerEntrega = pedidoCliente.fechaInicial;
       List<Date> entregaSemanal = new ArrayList<>();
       for (int i = 1; i <= pedidoCliente.cantEntregas; i++)
       {
           Date fechaSiguiente = sumarDiasAFecha(primerEntrega,7 * i);
           entregaSemanal.add(fechaSiguiente);
       }
       return entregaSemanal;
   }

    public static Date sumarDiasAFecha(Date fecha, int dias){
        if (dias==0) return fecha;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.DAY_OF_YEAR, dias);
        return calendar.getTime();
    }
}
