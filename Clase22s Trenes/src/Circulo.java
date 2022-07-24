public class Circulo implements AreaCalculable {

    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return radio * radio * Math.PI;
    }
}
