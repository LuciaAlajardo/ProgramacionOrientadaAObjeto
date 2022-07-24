import java.util.ArrayList;
import java.util.List;

public class Locomotora implements AreaCalculable{


    private List<AreaCalculable> elementosLocomotoraList;

    public Locomotora() {
        elementosLocomotoraList = new ArrayList<>();
    }

    public void agregarFigurasLocomotora(AreaCalculable areaCalculable) {
        elementosLocomotoraList.add(areaCalculable);}

    @Override
    public Double calcularArea() {
        Double totalLocomotora = 0.00;
        for (AreaCalculable areaCalculable : elementosLocomotoraList) {
            totalVagon += areaCalculable.calcularArea();
        }
        return totalVagon;
    }

}
