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

/*
    @Override
    public Integer numeroAmbulancias( ){

        Integer cant;

        List<Integer> cantidadesDeAmbulanciasPorBase = this.bases
                .stream()
                .map(base-> {return base.numeroAmbulancias();})
                .collect(Collectors.toList());

        cant = cantidadesDeAmbulanciasPorBase.mapToInt(Integer::IntValue)
                .sum();
        return cant
    }
*/
/*
    @Override
    public Integer numeroAmbulancias( ){

        Integer cant;

        List<Integer> cantidadesDeAmbulanciasPorBase = this.bases
                .stream()
                .map(base-> {return base.numeroAmbulancias();})
                .collect(Collectors.toList());

        cant = cantidadesDeAmbulanciasPorBase.mapToInt(Integer::IntValue)
                .sum();
        return cant;
    }
*/
    @Override
    public Integer numeroAmbulancias( ){



        List<Integer> cantidadesDeAmbulanciasPorBase = this.bases
                .stream()
                .map(base-> {return base.numeroAmbulancias();})
                .collect(Collectors.toList());

        return cantidadesDeAmbulanciasPorBase.sum();
    }
   // tiempo medio de asistencia, que en el caso de las bases compuestas es la media de los tiempos
   // medios de asistencia registrados en las bases que las componen en ese momento

    @Override
    public Double tiempoMedioDeAsistencia(){
        List<Double> tiempoMedioDeAsistenciaPorBase = this.bases
                .stream()
                .map(base-> {return base.tiempoMedioDeAsistencia();})
                .collect(Collectors.toList());

        return tiempoMedioDeAsistenciaPorBase.sum() / tiempoMedioDeAsistenciaPorBase.size();
    }
}
