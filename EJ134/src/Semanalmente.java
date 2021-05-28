import java.util.Date;
import java.util.List;
import java.util.Calendar;

public class Semanalmente implements Peridiocidad
{
   public List<Date> fechasEntrega(Pedido pedidoCliente)
   {

       Date primerEntrega = pedidoCliente.fechaInicial;
       List<Date> entregaSemanal;
       for (int i = 0; i < pedidoCliente.cantEntregas; i++)
       {
           sumarDiasAFecha(primerEntrega,7);
           entregaSemanal.add(primerEntrega);
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
