package animales;

public abstract class Animal {
    private String nombre;
    private String pelaje;
    private int edad;

    public Animal (String nombre, String pelaje, int edad){
        this.nombre = nombre;
        this.pelaje = pelaje;
        this.edad = edad; // this nombre es el atributo, y nombre es el parametro que me pasan
    }
    //esto no se va a poder cambiar porque ya esta implementado metodo concreto

    public void comer(){
        System.out.println(this.nombre + " estoy comiendo");
    }

    //esto es un metodo ABSTRACTO. a este si se le puede implementar
    public abstract void hacerRuido();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

