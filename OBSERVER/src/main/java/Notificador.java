import java.util.List;

public class Notificador
{
    private List<InteresadoEnBateria> interesados;

    public void notificar(Bateria bateria)
    {
        for (InteresadoEnBateria interesado : interesados){
            interesado.cambioEnLaBateria(bateria);
        }
    }
}
