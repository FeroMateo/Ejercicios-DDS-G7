public class Bateria
{
    private Estado estadoBateria;
    private Integer porcentajeCarga;
    private Integer tiempoRestante;
    private Notificador notificador;

    public Integer getTiempoRestante()
    {
     return tiempoRestante;
    }
    public Integer getPorcentajeCarga()
    {
        return porcentajeCarga;
    }

    public void notificar()
    {
        notificador.notificar(this);
    }
}
