package animales;

public class Gato extends Animal implements Mascota, Felinos{

    private boolean esTravieso;

    public Gato(String nombre, String pelaje, int edad) {
        super(nombre, pelaje, edad);
        this.esTravieso = true; //tambien se puede poner directamente los valores
    }

    @Override
    public void hacerRuido() {
        System.out.println("miau - miau");
    }

   public void setEsTravieso(boolean esTravieso){
    this.esTravieso = esTravieso;
    }

    public boolean setEsTravieso(){
        return this.esTravieso;
    }


    @Override
    public void mostrarEdad(int edad) {
        System.out.println(" la edad del gato " + getNombre() + " es " + getEdad());

    }

    @Override
    public int calcularEdadHumanos(int edad) {
        return getEdad()*5;
    }
 // INTERFACE FELINO
    @Override
    public boolean esFelinoSalvaje() {
        return false;
    }
    //POLIMIRFISMO caracteristica de dos objetos de responder al mismo metodoe.
    // ejemplo perro y gato responden a hacer ruido
}
