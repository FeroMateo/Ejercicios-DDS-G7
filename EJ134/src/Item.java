public class Item
{
    private Producto producto;
    private Integer cantidad;
    private Double precioUnitario;
    private Envase envaseItem;

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
