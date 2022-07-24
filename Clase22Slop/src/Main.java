public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("C5 inc");

        empresa.agregarEmpleado(EmpleadoFactory.CLAVE_EMPLEADO_CONTRATADO);
        empresa.agregarEmpleado("hola");
        empresa.agregarEmpleado("codigo falso");
        empresa.agregarEmpleado(EmpleadoFactory.CLAVE_EMPLEADO_RELACIOND);

        System.out.println(empresa.calcularSueldoTotales(30));
    }
}