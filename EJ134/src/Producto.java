public class Producto
{
    public String idArticulo;
    public String descripcion;
    private TipoProducto tipoProducto;


    public Envase envasePredefinido()
    {
        return tipoProducto.devolverEnvase();
    }
}
