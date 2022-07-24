import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;

    private List<Empleado> empleadoList = new ArrayList<>();

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        this.empleadoList = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado){
        empleadoList.add(empleado);
    }


    public Double calcularSueldoTotal(){
        Double total = 0.0;
        for (Empleado empleado : empleadoList) {
            total  += empleado.calcularSueldo(30);
        }
        return total;
}

}
