public abstract class PesoCarga {
    private String nombre;
    private String descripcion;

    public PesoCarga(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPeso();

    @Override
    public String toString() {
        return "Nombre " + nombre+ " peso " + calcularPeso();
    }
}
