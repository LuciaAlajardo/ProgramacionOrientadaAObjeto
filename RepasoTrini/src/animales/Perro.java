package animales;

import java.util.Objects;

public class Perro extends Animal implements Mascota{
    private String raza;

    public Perro(String nombre, String pelaje, int edad, String raza) {
        super(nombre, pelaje, edad); //en el SUPER muestra los atributos del padre
        this.raza = raza;
    }

    @Override //metodo heredado
    public void hacerRuido() {
        System.out.println( "Guau - Guau");
    }
    public void pasear(){ // metodo propio del perro
        System.out.println(getNombre() + " esta paseando");
    }

    // sobrecarga cuando creas el mismo método y le pasas diferentes parámetros,
    // y cuando llamas al main te elige si llamas a uno o el otro

    public void pasear(String lugar){
        System.out.println(getNombre() + " esta paseando en " + lugar);
    }

   public void setRaza(String raza){
        this.raza = raza;
   }

   public String getRaza(){
        return this.raza = raza;
   }

   // sobreescribimos el metodo para que sean iguales

    @Override
    public boolean equals(Object perro) {
        // recibe el objeto y le ponemos la implementacion que queresmos
        // decimos si el nombre es igual es el mismo perro
        /*boolean esElMismoPerro = false;
        Perro perroCasteado = (Perro) perro;
        if (getNombre().equals(perroCasteado.getNombre())) {
            esElMismoPerro = true;
        }*/

        // resumimos todo elEQUALS.
        return getNombre().equals(((Perro)perro).getNombre());
    }
 // INTERFAZ esto va dejabo de los @ pero lo dejo aca
    @Override
    public void mostrarEdad(int edad) {
        System.out.println(" la edad de " + getNombre() + " es " + getEdad());
    }

    @Override
    public int calcularEdadHumanos(int edad) {
        return getEdad()*7;
    }




