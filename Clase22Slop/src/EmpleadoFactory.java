public class EmpleadoFactory {

    public static final String CLAVE_EMPLEADO_RELACIOND = "EMP-RD";
    public static final String CLAVE_EMPLEADO_CONTRATADO = "EMP-PH";

    private static EmpleadoFactory instance;

    private EmpleadoFactory(){

    }

    public static EmpleadoFactory getInstance() {
        if(instance == null){
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    public Empleado crearEmpleado(String codigo) throws EmpleadoFactoryException{
        switch (codigo){
            case CLAVE_EMPLEADO_RELACIOND :
                return new EmpleadoRelacionDeDependencia("Maria","Gomez",1,1000.0);
            case CLAVE_EMPLEADO_CONTRATADO:
                return new EmpleadoContratado("Juan","Perez",2,7.0,0.14);
        }

        throw new EmpleadoFactoryException("el codigo " + codigo + " no es valido");
    }
}
