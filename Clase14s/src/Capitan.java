public class Capitan {
    private String nombre;
    private String apellido;
    private String matricula;

    public Capitan(String nombre, String apellido, String matricula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Apellido: " + apellido + " Matricula: " + matricula;
    }
}
