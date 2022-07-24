public class Main {
    public static void main(String[] args) {

        Juego juegoEnCD = new JuegoFisico("Crash Bandicoot", 20, true);
        Descargable juevoVirtual = new JuegoDigital("Super Mario Sushine", 50, 1024);
        Demo demostracion = new Demo("Methid Prime", 512);

        System.out.println("El precio del juego es: "+ juegoEnCD.vender()); //es un juego que vale 20, pero es usado
        System.out.println("El precio del Juego Virtual es: " + ((Juego)juevoVirtual).vender());

        if (juegoEnCD.compareTo((Juego)juevoVirtual) >= 0){
            System.out.println("El crash es igual o mas caro ");
        }else {
            System.out.println("El Super Mario es mas caro");
        }

        juevoVirtual.descargar(256);
        demostracion.descargar(16);

        demostracion.jugarNivel();
        demostracion.jugarNivel();
        demostracion.jugarNivel();
        
        juegoEnCD.jugarNivel();
        juegoEnCD.jugarNivel();
        juegoEnCD.jugarNivel();
        juegoEnCD.jugarNivel();
        juegoEnCD.jugarNivel();
        juegoEnCD.jugarNivel();
        juegoEnCD.jugarNivel();
        System.out.println("Estas en el nivel: " + juegoEnCD.getNivel());
    }
}