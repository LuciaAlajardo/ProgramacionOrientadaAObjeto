import java.util.ArrayList;
import java.util.List;

public class UnidadDeTrabajoCombinada extends UnidadDeTrabajo{
    private Integer coeficienteGlobal;
    private Double montoMaterial;
    private List<UnidadDeTrabajo> unidadDeTrabajoList;

    public UnidadDeTrabajoCombinada(String nombre, String descripcion, Integer coeficienteGlobal, Double montoMaterial) {
        super(nombre, descripcion);
        this.coeficienteGlobal = coeficienteGlobal;
        this.montoMaterial = montoMaterial;
        unidadDeTrabajoList = new ArrayList<>();
    }
    public void agregarUnidadDeTrabajo(UnidadDeTrabajo unidadDeTrabajo){
        unidadDeTrabajoList.add(unidadDeTrabajo);
    }

    @Override
    public Double calcularMonto() {
        Double montoTotal = 0.0;
        for (UnidadDeTrabajo unidadDeTrabajo : unidadDeTrabajoList) {
            montoTotal += unidadDeTrabajo.calcularMonto(); //lista que se llama unidad de trabajo,
            // la recorro, cada unidad de trabajo que tenga adentro, y por cada una de estas,le pedimos
            // que a monto total le sume el metodo de cada unidad de trabajo
        }
        return montoTotal * coeficienteGlobal;
    }
}
