import java.util.ArrayList;
import java.util.List;

public class HabilidadCombinada extends Habilidad{
    private Integer multiplicador;
    private List<Habilidad> habilidadList;

    public HabilidadCombinada(String nombre, String descripcion, Integer multiplicador) {
        super(nombre, descripcion);
        this.multiplicador = multiplicador;
        habilidadList = new ArrayList<>();
    }
    public void agregarHabilidad(Habilidad habilidad){habilidadList.add(habilidad);}

    @Override
    public Double calcularPuntaje() {
        Double puntajeTotal = 0.0;
        for (Habilidad habilidad : habilidadList) {
            puntajeTotal += habilidad.calcularPuntaje();
        } return puntajeTotal * multiplicador;
    }
}
