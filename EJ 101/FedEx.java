package domain;

public class FedEx implements Transportista
{
    private int ConstanteEnvio;

    public Double costo(Envio envio) {
        return envio.peso()*ConstanteEnvio;
    }
}
