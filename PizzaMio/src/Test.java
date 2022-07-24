public class Test {
    public static void main(String[] args) {
        PizzaLoca pizzaLoca = new PizzaLoca();
        PizzaFactory pizzaFactory = PizzaFactory.getInstance();

        pizzaLoca.agregarPizza(pizzaFactory.crearPizza(PizzaFactory.MUZZARELLA));
        pizzaLoca.agregarPizza(pizzaFactory.crearPizza(PizzaFactory.ESPECIAL));
        pizzaLoca.agregarPizza(pizzaFactory.crearPizza(PizzaFactory.ANANÁ));
        pizzaLoca.agregarPizza(pizzaFactory.crearPizza(PizzaFactory.COMBINADA_LOCA));

        pizzaLoca.mostrarPizzas();
    }
}