public class Item
{
    Producto producto;
    Integer cantidad;
    Double precio;
    Envase envaseItem;

    public void elegirEnvase(Envase envase)
    {
        if(envase == null)
        {
            envaseItem = producto.envasePredefinido();
        }
        else
        {
            envaseItem = envase;
        }
    }

}
