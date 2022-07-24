import java.util.ArrayList;
import java.util.List;

public class Combo implements Comprable {

    private Double descuento;
    private List<Comprable> comprableList;

    public Combo(Double descuento) {
        this.descuento = descuento;
        comprableList = new ArrayList<>();
    }

    public void agregarComprable(Comprable comprable){
        comprableList.add(comprable);
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        System.out.println("encontre un combo");
        for (Comprable comprable : comprableList) {
            precioTotal += comprable.calcularPrecio();
        }
        System.out.println("el precio total de los comprables es de " + precioTotal);
        Double precioFinal = precioTotal - precioTotal*descuento;
        System.out.println("el precio final con el descuento es de " + precioFinal);

        return precioFinal;
    }
}
