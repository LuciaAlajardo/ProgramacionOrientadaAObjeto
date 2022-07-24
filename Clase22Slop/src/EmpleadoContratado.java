public class EmpleadoContratado extends Empleado  {

    private Double importeProHora;
    private Double retencionImpuesto;

    public EmpleadoContratado(String nombre, String apellido, Integer legajo, Double importeProHora, Double retencionImpuesto) {
        super(nombre, apellido, legajo);
        this.importeProHora = importeProHora;
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public Double calcularSueldos(Integer diasTrabajados) {
        Double sueldoTotal = (importeProHora * 8 * diasTrabajados);
        return sueldoTotal - sueldoTotal * retencionImpuesto;
    }
}
