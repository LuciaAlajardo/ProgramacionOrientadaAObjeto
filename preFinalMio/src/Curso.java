public class Curso extends OfertaAcademica{
    private Double valorPorHora;
    private Double horasMensuales;
    private Double duracionMeses;

    public Curso(String nombre, String descripcion, Double valorPorHora, Double horasMensuales, Double duracionMeses) {
        super(nombre, descripcion);
        this.valorPorHora = valorPorHora;
        this.horasMensuales = horasMensuales;
        this.duracionMeses = duracionMeses;
    }

    @Override
    public Double calcularPrecio() {

        return horasMensuales * valorPorHora * duracionMeses;
    }
}
