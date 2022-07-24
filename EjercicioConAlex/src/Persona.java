public class Persona {
    private String nombre;
    private String apellido;
    private String DNI; //porque tiene punto
    private Integer edad;

    public Persona(String nombre, String apellido, String DNI, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.edad = edad;
    }
}
