package domain;
public class Ubicacion
{
    private String calle;
    private String localidad;
    private String altura;
    private String depto;
    private String piso;

    public Boolean esCercanoA(Ubicacion unaUbicacion)
    {
        //RETURN -> Destino - Partida < DistanciaMinima
        return true;
    }
}
