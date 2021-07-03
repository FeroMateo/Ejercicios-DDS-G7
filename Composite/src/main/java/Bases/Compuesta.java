package Bases;
import Bases.BaseSanitaria;

import java.util.List;
import java.lang.Override;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.DoubleSummaryStatistics;


import java.util.ArrayList;



    public class Compuesta implements  BaseSanitaria{

    private String nombreBase;
    private Integer numeroAmbulancias;
    private List<BaseSanitaria> bases;

    public Integer getNumeroAmbulancias() {
        return numeroAmbulancias;
    }

    public Integer retornarCantidadAmbulancias(BaseSanitaria base){
    return base.numeroAmbulancias();
}

    @Override
    public Integer numeroAmbulancias( ){

    Integer cant;

    Integer cantidadesDeAmbulanciasPorBase = this.bases
            .stream()
            .mapToInt(base -> retornarCantidadAmbulancias(base))
            .sum();

    return cantidadesDeAmbulanciasPorBase;

}

    public Double tiempoMedioPorBase(BaseSanitaria base){
    return base.tiempoMedioDeAsistencia();
    }

    @Override
    public Double tiempoMedioDeAsistencia(){
        Double tiempoMedioDeAsistenciaPorBase = this.bases
                .stream()
                .mapToDouble(base -> tiempoMedioPorBase(base))
                .sum();


        return tiempoMedioDeAsistenciaPorBase / bases.size();
    }
}
