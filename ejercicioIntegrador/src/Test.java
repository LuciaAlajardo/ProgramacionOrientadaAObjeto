public class Test {
    public static void main(String[] args) {

        Barco barco = new Barco();
        PesoCargaFactory pesoCargaFactory = PesoCargaFactory.getInstance();
        barco.agregarCarga(pesoCargaFactory.crearCarga("uno"));
        barco.agregarCarga(pesoCargaFactory.crearCarga("dos"));
        barco.agregarCarga(pesoCargaFactory.crearCarga("tres"));

        barco.mostrarCargas();
    }
}