public class EmpleadoRelacionDeDependencia extends Empleado{

    private Double sueldoMensual;

    public EmpleadoRelacionDeDependencia(String nombre, String apellido, Integer legajo, Double sueldoMensual) {
        super(nombre, apellido, legajo);
        this.sueldoMensual = sueldoMensual;
    }


    @Override
    public Double calcularSueldos(Integer diasTrabajados) {
        return sueldoMensual * diasTrabajados / 30;
    }
}
