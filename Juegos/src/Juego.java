public abstract class Juego implements Comparable<Juego>{
    private String nombre;
    private Integer precio;
    private Integer nivel;

    public Juego(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.nivel = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void jugarNivel(){
        nivel ++; //sube de nivel.
    }

    public abstract Double vender();


    @Override
    public int compareTo(Juego o) {
        return this.precio - o.precio; // compare to, va a dar positivo si mi precio es mayor,
                                       // negativo si es menor y 0 si son del mismo precio.
    }
}
