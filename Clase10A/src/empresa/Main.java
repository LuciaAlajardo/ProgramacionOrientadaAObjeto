package empresa;

public class Main {
    public static void main(String[] args) {

        EmpleadoMarketing empleado1 = new EmpleadoMarketing("Pedro ", "Sanchez ", " 333 ", " redes sociales");
        empleado1.trabajar();
        empleado1.trabajar(4);

        EmpleadoRRHH empleado2 = new EmpleadoRRHH("Juan ", "Romero ", "444", 5);
        empleado2.trabajar();
        empleado2.getAltasLogradas();


        EmpleadoProduccion empleado3 = new EmpleadoProduccion("Federico ", "Alajardo", "37559", 8);
        empleado3.trabajar();
        empleado3.getTiempoExperiencia();
    }
}