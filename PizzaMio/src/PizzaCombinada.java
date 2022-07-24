import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza{
    private List <Pizza> pizzaList;

    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        this.pizzaList = new ArrayList<>(); //OJO ACA NO LA INICIALICE
    }
    public void agregarPizza(Pizza pizza){
        pizzaList.add(pizza);
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        for (Pizza pizza : pizzaList) {
            precioTotal += pizza.calcularPrecio();
        }
        return precioTotal / pizzaList.size(); //OJO ACA
    }
}
