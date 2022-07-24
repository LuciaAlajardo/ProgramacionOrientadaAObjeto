package com.company;


public class ExamenFinal extends Examen implements Comparable{

    private String tema;
    private Double notaOral;

    public ExamenFinal(Alumno alumno, String titulo, String enunciado, Double nota, String tema, Double notaOral) {
        super(alumno, titulo, enunciado, nota);
        this.tema = tema;
        this.notaOral = notaOral;
    }

    @Override
    public int compareTo(Object object) {
        ExamenFinal otroExamen = (ExamenFinal) object;

        Double promedioThis = this.calcualPromedio();
        Double promedioOtro = otroExamen.calcualPromedio();


        if(promedioThis > promedioOtro){
            return 1;
        }
        if(promedioThis < promedioOtro){
            return -1;
        }
        return 0;
    }

    private Double calcualPromedio(){
        return (notaOral + getNota()) /2;
    }
}
