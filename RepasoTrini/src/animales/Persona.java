package animales;

public class Persona {
    // no hereda porque no es un animal.
    //asociación con composición es tener un atributo, que no lo hereda, "tiene un".
    // es horizontal estan todos en la misma linea se relacionan asi


    // aca hago el costructor y me va a pedir los datos del nuevo perro
    public Persona() {
        this.mascota = new Perro("Theo", "largo", 2, "callle");
    }
    //SOBRECARGA DE CONSTRUCTOR

    public Persona(Animal mascota) { // aca no sabemos si tiene un perro un gato
        this.mascota = mascota;
    }

    private Animal mascota;

    public Animal getMascota() {
        return mascota;
    }

    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }
}
