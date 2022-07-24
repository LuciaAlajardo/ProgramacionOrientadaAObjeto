public class Chofer {
    private String nombre;
    private String apellido;
    private Auto auto;

    public Chofer(String nombre, String apellido, Auto auto){
        this.nombre = nombre;
        this.apellido = apellido;
        this.auto = auto;
    }
    // para ver la patente
    public String verPatente(){
        return auto.getPatente(); //el chofer tiene un auto y de esta manera accedemos a informacion del auto
    }
}
