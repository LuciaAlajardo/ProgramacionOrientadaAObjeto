public class PizzaFactory {
    public static final String MUZZARELLA = "Muzzarella";
    public static final String ESPECIAL = "Especial";
    public static final String ANANÁ = "Ananá";
    public static final String COMBINADA_LOCA = "Combinada Loca";
    private static PizzaFactory instance;

    private PizzaFactory (){}

    public static PizzaFactory getInstance(){
        if (instance == null){
            instance = new PizzaFactory();
        }return instance;
    }

    public Pizza crearPizza(String codigo){
        switch (codigo){
            case MUZZARELLA:
                return new PizzaSimple("Muzzarella", "Muzzrella, morrón y jamón", 700.0, false);
            case ESPECIAL:
                return new PizzaSimple("Especial", "Queso, Jamón, morron y huevo",850.0,false);
            case ANANÁ:
                return new PizzaSimple("Ananá", "Queso, Jamón, morron y ananá", 950.0, false);

            case COMBINADA_LOCA:
                PizzaCombinada pizzaCombinada = new PizzaCombinada("Pizza Loca","Queso, Jamón, morron y ananá");
                pizzaCombinada.agregarPizza(crearPizza(ESPECIAL));
                pizzaCombinada.agregarPizza(crearPizza(ANANÁ));

                return pizzaCombinada;
        }
        return null;
    }
}
