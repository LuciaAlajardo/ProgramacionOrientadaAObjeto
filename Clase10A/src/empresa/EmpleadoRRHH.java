package empresa;

public class EmpleadoRRHH extends Empleado{
    private int altasLogradas;

    @Override
    public void trabajar() {
        System.out.println("Empleado de RRHH " + getNombre() + "trabajando " + "Sus altas logradas son " + altasLogradas); //aca nos marca en rojo nombre, lo que
                                                                        // tenemos que acceder atraves de un get
    }

    public int getAltasLogradas() {
        return altasLogradas;
    }

    public void setAltasLogradas(int altasLogradas) {
        this.altasLogradas = altasLogradas;
    }

    public EmpleadoRRHH(String nombre, String apellido, String dni, int altasLogradas) {
        super(nombre, apellido, dni);
        this.altasLogradas = altasLogradas;
    }

}
