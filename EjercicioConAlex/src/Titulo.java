import java.util.Date;

public abstract class Titulo {
    private Persona dueño;
    private Integer cantidadDeMaterias;
    private Date fechaInicioCarrera;
    private Date fechaFinalCarrera;
    private boolean selloIntitucion;
    private boolean selloMinisterio;

    public Titulo(Persona dueño, Integer cantidadDeMaterias, Date fechaInicioCarrera, Date fechaFinalCarrera, boolean selloIntitucion, boolean selloMinisterio) {
        this.dueño = dueño;
        this.cantidadDeMaterias = cantidadDeMaterias;
        this.fechaInicioCarrera = fechaInicioCarrera;
        this.fechaFinalCarrera = fechaFinalCarrera;
        this.selloIntitucion = selloIntitucion;
        this.selloMinisterio = selloMinisterio;
    }

    public boolean puedeEjercer(){
        return selloIntitucion && selloMinisterio; //en lugar de hacer un if, porque los dos son true
    }
}
