package empresa;

public class EmpleadoProduccion extends Empleado{
    private int tiempoExperiencia;

    //sobreescribir

    @Override
    public void trabajar() {
        System.out.println("Empleado de Producción " + getNombre() + "trabajando " + " Su tiempo de experiencia es " + tiempoExperiencia );
    }

    public int getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    public void setTiempoExperiencia(int tiempoExperiencia) {
        this.tiempoExperiencia = tiempoExperiencia;
    }

    //constructor
    public EmpleadoProduccion(String nombre, String apellido, String dni, int tiempoExperiencia) {
        super(nombre, apellido, dni);
        this.tiempoExperiencia = tiempoExperiencia;
    }
}
