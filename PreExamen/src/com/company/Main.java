package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Alumno alumno = new Alumno("Jaimito","Perez",1);

        ExamenFinal examenFinal = new ExamenFinal(alumno,"POO","examen",2.0,"",5.0);
        ExamenFinal otroexamen = new ExamenFinal(alumno,"POO","examen",5.0,"",5.0);

    }
}
