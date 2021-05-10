package domain;

public class FedEx implements Transportista
{
    private int tarifaPorPeso;

    public Double costo(Envio envio) {
        return envio.peso()*tarifaPorPeso;
    }
}
