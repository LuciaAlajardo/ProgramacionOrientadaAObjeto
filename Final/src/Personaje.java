import java.util.ArrayList;
import java.util.List;

public class Personaje {

    private List<Habilidad> habilidadList;

    public Personaje() {
        habilidadList = new ArrayList<>();
    }

    public void agregarHabilidad(Habilidad habilidad){habilidadList.add(habilidad);}


    public void mostrarHabilidad(){
        for (Habilidad habilidad : habilidadList) {
            System.out.println(habilidad);
        }
    }
}

