package empresa;

public class EmpleadoMarketing extends Empleado {
    private String area;

    @Override
    public void trabajar() {
        System.out.println("Empleado de Marketing " + getNombre() + "trabajando en " + area);
    }
    //vamos a sobrecargar

    public void trabajar(int horasExtras){
        System.out.println("Empleado de Marketing " + getNombre() + "trabajando en " + area + " con " + horasExtras + "hs extra");
    }


    // creamos el constructor


    public EmpleadoMarketing(String nombre, String apellido, String dni, String area) {
        super(nombre, apellido, dni);
        this.area = area;
    }
}
