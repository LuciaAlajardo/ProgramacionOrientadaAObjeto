import java.util.ArrayList;
import java.util.List;

public class Vagon implements AreaCalculable {

    private List<AreaCalculable> elementosVagonList;

    public Vagon() {
        elementosVagonList = new ArrayList<>();
    }

    public void agregarFiguras(AreaCalculable areaCalculable) {elementosVagonList.add(areaCalculable);}

    @Override
    public Double calcularArea() {
        Double totalVagon = 0.00;
        for (AreaCalculable areaCalculable : elementosVagonList) {
            totalVagon += areaCalculable.calcularArea();
        }
        return totalVagon;
    }
}
