package animales;

public class Leopardo extends Animal implements Felinos {
    public Leopardo(String nombre, String pelaje, int edad) {
        super(nombre, pelaje, edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println(" gerrr- gerr");
    }

    @Override
    public boolean esFelinoSalvaje() {
        return true;
    }
}
