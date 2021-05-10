package domain;

public class Envio
{
    private Paquete unPaquete;
    private Transportista unTransportista;
    private Ubicacion partida;
    private Ubicacion destino;
/*
    public Double costo()
    {
        //Return -> ??
        return
    }
 */
    public void cambiarTransportista(Transportista trans)
        {
            unTransportista = trans;
        }
    public Double peso()
    {
        return unPaquete.getPeso();
    }
    public Boolean esCortaDistancia() {
        return destino.esCercanoA(partida);
    }
}
