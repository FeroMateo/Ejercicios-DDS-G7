package domain;

interface Transportista
{
     Double costo(Envio envio);
}

public class Estandar implements Transportista {

    public Double costo(Envio envio) {
        return envio.peso();
    }
}





