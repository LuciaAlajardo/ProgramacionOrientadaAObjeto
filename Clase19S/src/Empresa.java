import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String razonSocial;

    private List<Empleado> empleadoList;

    public Empresa(String razonSocial){
        empleadoList = new ArrayList<>();
        this.razonSocial = razonSocial;
    }

    public void agregarEmpleado(Empleado empleado){
        empleadoList.add(empleado);
    }

    public Double calcularSueldoTotal(int dias) {
        Double total = 0.00;
        for (Empleado empleado : empleadoList) {
            total += empleado.calcularSueldo(dias);
        }
        return total;
    };

}
