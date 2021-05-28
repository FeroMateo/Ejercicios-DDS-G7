import java.util.Date;
import java.util.List;

public class Entrega
{
    List<Item> listaItems;
    Date fechaEntrega;

    public void agregarItem(Item item)
    {
        listaItems.add(item);
    }

}
