import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Mensualmente implements Periodicidad
{

    @Override
    public List<Date> fechasEntrega(Pedido pedidoCliente) {
        //Aca iria la logica para poder devolver la lista de fechas
        //Cada una con un mes de diferencia a partir de la primera
        //Si utilizamos LocalDateTime es mas sencillo de resovler que con Date
        return Arrays.asList();
    }
}
