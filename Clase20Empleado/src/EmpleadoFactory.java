public class EmpleadoFactory {

    private static EmpleadoFactory instancia;

    EmpleadoFactory(){

    }

    public static EmpleadoFactory getInstance() {
        if (instancia == null) {
            instancia = new EmpleadoFactory();
        }
        return instancia;
    }

    public Empleado construirEmpleado(String tipoEmpleado){

        switch (tipoEmpleado){
            case "EMP-RD":
                return new EmpleadoRelacionDependencia("Milene","Arce",123,  1000.0);
            case "EMP-PH":
                return new EmpleadoContratado("Ro","Lee",1234,  7.0, 14.0);
        }
        return null;
    }
}
