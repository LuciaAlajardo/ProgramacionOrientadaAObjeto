import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Comprable> comprableList;

    public Carrito() {
        comprableList = new ArrayList<>();
    }

    public void agregarComprable(Comprable comprable){
        comprableList.add(comprable);
    }

    public Double calcularPrecioTotal(){
        Double precioFinal = 0.0;
        for (Comprable comprable : comprableList) {
            precioFinal += comprable.calcularPrecio();
        }
        return precioFinal;
    }
}
