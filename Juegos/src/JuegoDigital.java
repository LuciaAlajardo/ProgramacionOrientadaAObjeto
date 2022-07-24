public class JuegoDigital extends Juego implements Descargable{
    private Integer pesoEnMbs;

    public JuegoDigital(String nombre, Integer precio, Integer peroEnMbs) {
        super(nombre, precio);
        this.pesoEnMbs = peroEnMbs;
    }

    @Override
    public Double vender() {
        return getPrecio().doubleValue(); //aca se vende normal.
    }

    @Override
    public void descargar(Integer velocidadDeDescargaEnMinutos) {
        System.out.println("Espere " + this.pesoEnMbs/velocidadDeDescargaEnMinutos + " minutos");

    }
}
