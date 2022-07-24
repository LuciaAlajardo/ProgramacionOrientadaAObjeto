import java.util.ArrayList;
import java.util.List;

public class CargaContenedor extends PesoCarga{

    private List <PesoCarga> pesoCargaList;
    private Double pesoContenedor;

    public CargaContenedor(String nombre, String descripcion, Double pesoContenedor) {
        super(nombre, descripcion);
        this.pesoContenedor = pesoContenedor;
        pesoCargaList = new ArrayList<>();
    }
    public void agregarCarga( PesoCarga pesoCarga){
        pesoCargaList.add(pesoCarga);
    }

    @Override
    public Double calcularPeso() {
        Double pesoCargaTotal= 0.0;
        for (PesoCarga pesoCarga : pesoCargaList) {
            pesoCargaTotal+= pesoCarga.calcularPeso();

        }
        return pesoCargaTotal + pesoContenedor;
    }
}
