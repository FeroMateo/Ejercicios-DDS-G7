public class PorcentajeCarga implements InteresadoEnBateria
{
    @Override
    public void cambioEnLaBateria(Bateria bat)
    {
        this.indicarPorcentajeCarga(bat);
    }

    void indicarPorcentajeCarga(Bateria bateria)
    {
        System.out.print(bateria.getPorcentajeCarga());
    }
}