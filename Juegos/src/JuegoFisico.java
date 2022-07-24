public class JuegoFisico extends Juego{
    private Boolean usado;

    public JuegoFisico(String nombre, Integer precio, Boolean usado) {
        super(nombre, precio);
        this.usado = usado;
    }

    @Override
    public Double vender() {
        return usado ? getPrecio()/2 : getPrecio().doubleValue(); //se vende a mitad de precio si es usad0,
                                                                    // sino lo pasamos a double
    }
}
