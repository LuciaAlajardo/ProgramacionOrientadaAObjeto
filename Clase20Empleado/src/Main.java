public class Main {
    public static void main(String[] args) {

        EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();
        Empresa empresa = new Empresa("lab");

        empresa.agregarEmpleado(empleadoFactory.construirEmpleado("EMP-RD"));

        System.out.println(empresa.calcularSueldoTotal());


    }
}