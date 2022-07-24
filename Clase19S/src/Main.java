public class Main {
    public static void main(String[] args) {

        EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();

        Empresa empresa = new Empresa("Sosa SRL");

        empresa.agregarEmpleado(empleadoFactory.crearEmpleado("EMP-PH","M","L",123));
        empresa.agregarEmpleado(empleadoFactory.crearEmpleado("EMP-RD","F","V",154));


        System.out.println("El sueldo total es " + (empresa.calcularSueldoTotal(15)));

    }
}