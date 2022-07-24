public class CargaSimple extends PesoCarga{
    private Double pesoDeCarga;
    private Boolean necesitaRefrigeracion;

    public CargaSimple(String nombre, String descripcion, Double pesoDeCarga, Boolean necesitaRefrigeracion) {
        super(nombre, descripcion);
        this.pesoDeCarga = pesoDeCarga;
        this.necesitaRefrigeracion = necesitaRefrigeracion;
    }

    @Override
    public Double calcularPeso() {
        Double totalCarga = 0.0;
        if(this.necesitaRefrigeracion == true){
            totalCarga += pesoDeCarga + (pesoDeCarga * 0.10);
        }
        return totalCarga= pesoDeCarga;
    }

    public Boolean getNecesitaRefrigeracion() {
        return necesitaRefrigeracion;
    }
}

