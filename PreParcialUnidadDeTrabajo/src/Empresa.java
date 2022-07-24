import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<UnidadDeTrabajo> unidadDeTrabajoList;


    public Empresa() {
        this.unidadDeTrabajoList = new ArrayList<>();
    }

    public void agregarUnidadDeTrabajo(UnidadDeTrabajo unidadDeTrabajo){
        unidadDeTrabajoList.add(unidadDeTrabajo);
    }

    public void mostrarUnidadDeTrabajo(){
        for (UnidadDeTrabajo unidadDeTrabajo : unidadDeTrabajoList) {
            System.out.println(unidadDeTrabajo);

        }
    }
}
