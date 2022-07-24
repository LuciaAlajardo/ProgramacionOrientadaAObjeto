import java.util.ArrayList;
import java.util.List;

public class Tren {

    private List<AreaCalculable> elementosTrenList;

    public Tren() {elementosTrenList = new ArrayList<>();}

    public void agregarElementos(AreaCalculable areaCalculable) {elementosTrenList.add(areaCalculable);}

    public Double calcularAreaTotal() {
    Double total = 0.00;
        for (AreaCalculable areaCalculable : elementosTrenList) {
            total += areaCalculable.calcularArea();
        }
        return total;
    };

}
