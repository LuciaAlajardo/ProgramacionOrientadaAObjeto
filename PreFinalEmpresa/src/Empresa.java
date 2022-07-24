import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<UnidadDeTrabajo> listaDeUnidadesDeTrabajo;
    public Empresa(){
        this.listaDeUnidadesDeTrabajo=new ArrayList<>();
    }
    public void agregarUnidadDeTrabajo(UnidadDeTrabajo unidadDeTrabajo){
        listaDeUnidadesDeTrabajo.add(unidadDeTrabajo);
    }
    public void mostrarUnidadesDeTrabajo(){
        for (UnidadDeTrabajo unidadDeTrabajo : listaDeUnidadesDeTrabajo) {
            System.out.println(unidadDeTrabajo);
        }
    }

}

