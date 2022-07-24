public class HabilidadSimple extends Habilidad{
    private Double puntaje;

    public HabilidadSimple(String nombre, String descripcion, Double puntaje) {
        super(nombre, descripcion);
        this.puntaje = puntaje;
    }

    @Override
    public Double calcularPuntaje() {

        if (getNombre() == "Disparar") {
            return puntaje * 1.1;
        } else {
            return puntaje;
        }
    }
}
