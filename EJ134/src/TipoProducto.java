import java.util.List;

public class TipoProducto
{
    private List<Envase> envasesPosibles;
    private String descripcion;

    public Envase devolverEnvase()
    {
        return envasesPosibles.stream().findFirst()
                .orElseThrow(() -> new NoHayEnvasesException("El tipo de producto no tiene envases disponibles"));
    }
}
