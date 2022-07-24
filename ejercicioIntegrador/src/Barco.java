import java.util.ArrayList;
import java.util.List;

public class Barco {
    private List<PesoCarga> pesoCargaList;

    public Barco() {
        pesoCargaList = new ArrayList<>();
    }
    public void agregarCarga( PesoCarga pesoCarga){
        pesoCargaList.add(pesoCarga);
    }

    public void mostrarCargas(){
        for (PesoCarga pesoCarga : pesoCargaList) {
            System.out.println(pesoCarga);
        }
    }
}
