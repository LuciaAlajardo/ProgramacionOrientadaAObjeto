package com.company;

public class ExamenParcial extends Examen{

    private Integer numeroUnidad;
    private Integer reintentos;

    public ExamenParcial(Alumno alumno, String titulo, String enunciado, Double nota, Integer numeroUnidad) {
        super(alumno, titulo, enunciado, nota);
        this.numeroUnidad = numeroUnidad;
        this.reintentos = 0;
    }

    public Boolean puedeRecuperar(){
        Integer reintentosPosible;
        if (numeroUnidad <= 3){
            reintentosPosible = 3;
        }else{
            reintentosPosible = 2;
        }

        return reintentos < reintentosPosible;
    }




}
