public class TiempoRestanteCarga implements InteresadoEnBateria
{
    @Override
    public void cambioEnLaBateria(Bateria bat)
    {
        this.indicarTiempoRestante(bat);
    }
    void indicarTiempoRestante(Bateria bateria)
    {
        System.out.print(bateria.getTiempoRestante());
    }
}
