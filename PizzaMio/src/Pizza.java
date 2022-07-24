public abstract class Pizza {
    private String nombre;
    private String descripcion;

    public Pizza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Nombre de la pizza: " + nombre + " Precio: " + calcularPrecio();
    }

    public abstract Double calcularPrecio();

}
