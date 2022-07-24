public class Main {
    public static void main(String[] args) {

        Articulo termo ;
        termo= new Articulo("Termo 1 l",100,10);

        System.out.println("Primer articulo" + termo.getDescripcion());
        System.out.println("El precio es:" + termo.consultarPrecio());
        System.out.println("Hay stock?" + termo.hayStock());
        System.out.println("El stock es: " + termo.getStock());
        termo.setStock(9);
        System.out.println("El stock es: " + termo.getStock());

        Articulo cafetera;
        cafetera= new Articulo("Cafetera 1 l",40,2);
        System.out.println("Segundo articulo" + cafetera.getDescripcion());
        System.out.println("El precio es:" + cafetera.consultarPrecio());
        System.out.println("Hay stock?" + cafetera.hayStock());
        System.out.println("El stock es: " + cafetera.getStock());
        cafetera.setStock(20);
        System.out.println("El stock es: " + cafetera.getStock());
    }
}