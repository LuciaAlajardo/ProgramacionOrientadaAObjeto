public class Main {
    public static void main(String[] args) {
        Chofer chofer;
        chofer = new Chofer("Javier", "Perez", new Auto("abc123", "ford","Modelo"));
        System.out.println("La patente de este chofer es " + chofer.verPatente());
    }
}