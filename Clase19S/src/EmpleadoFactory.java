public class EmpleadoFactory {

    private static EmpleadoFactory instance;

    private EmpleadoFactory() {
    };

    public static EmpleadoFactory getInstance() {
        if(instance == null){
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    public Empleado crearEmpleado(String codigo, String nombre, String apellido, int legajo) {
        switch (codigo){
            case "EMP-RD" :
                return new EmpleadoRelacionDependencia(nombre,apellido,legajo, 1000.00);
            case "EMP-PH" :
                return new EmpleadoContratado(nombre,apellido,legajo,7.00,0.14);
        }
        return null;
    }
}
