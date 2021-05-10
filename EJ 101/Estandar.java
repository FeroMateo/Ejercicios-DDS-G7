package domain;

interface Transportista
{
     Double costo(Envio envio);
}

public class Estandar implements Transportista {
    private int tarifaPorPeso;
    private int tarifaLargaDistancia;


    public Double costo(Envio envio) {

        if (envio.esCortaDistancia())
    {
        return envio.peso()*tarifaPorPeso;
    }else
    {
        return envio.peso()*tarifaLargaDistancia;
    }


    }
}





