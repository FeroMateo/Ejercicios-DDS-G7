import java.util.Date;
import java.util.List;

public class Entrega
{
    List<Item> listaItems;
    Date fechaEntrega;

    public Entrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void agregarItem(Item item)
    {
        listaItems.add(item);
    }

}
