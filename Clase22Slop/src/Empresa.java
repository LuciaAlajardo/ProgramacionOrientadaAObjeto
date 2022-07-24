import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String razonSocial;
    private List<Empleado> empleadoList;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        empleadoList = new ArrayList<>();
    }

    public void agregarEmpleado(String codigoEmpleado){
        try {
            empleadoList.add(EmpleadoFactory.getInstance().crearEmpleado(codigoEmpleado));
        }catch (EmpleadoFactoryException e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public Double calcularSueldoTotales(Integer diasTrabajados){

        Double sueldosTotales = 0.0;
        for (Empleado empleado : empleadoList) {
            sueldosTotales += empleado.calcularSueldos(diasTrabajados);
        }
        return sueldosTotales;

    }




}
