import java.util.ArrayList;
import java.util.List;

public class UnidadCompuesta extends UnidadDeTrabajo{
    private Double coeficienteGlobal;
    private Double montoDeMaterial;
    private List<UnidadDeTrabajo> listaDeUnidadesDeTrabajo;

    public UnidadCompuesta(String nombre, String descripcion, Double coeficienteGlobal, Double montoDeMaterial) {
        super(nombre, descripcion);
        this.coeficienteGlobal = coeficienteGlobal;
        this.montoDeMaterial = montoDeMaterial;
        this.listaDeUnidadesDeTrabajo= new ArrayList<>();
    }
    public void agregarUnidadDeTrabajo(UnidadDeTrabajo unidadDeTrabajo){
        listaDeUnidadesDeTrabajo.add(unidadDeTrabajo);
    }

    @Override
    public Double calcularMonto() {
        Double montoTotal= 0.0;
        for (UnidadDeTrabajo unidadDeTrabajo:listaDeUnidadesDeTrabajo) {
            montoTotal += unidadDeTrabajo.calcularMonto();
        }
        return montoTotal*coeficienteGlobal;
    }
}
