package Bases;
import Bases.BaseSanitaria;


import java.util.List;
import java.util.stream.IntStream;

public abstract class  Simple implements BaseSanitaria
{

    private String nombre;
    private List<Ambulancia> ambulancias;
    private Double tiempoAsistencia;

    //@Override
    public Integer numeroAmbulancias(){ return this.ambulancias.size(); }

    public Double tiempoAsistencia(){ return tiempoAsistencia;}
}
