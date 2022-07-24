public abstract class Embarcacion {
    private Capitan capitan;
    private Double precioBase;
    private Double valorAdicional;
    private Integer anioDeFabricacion;
    private Double eslora;

    public Embarcacion(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioDeFabricacion, Double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anioDeFabricacion = anioDeFabricacion;
        this.eslora = eslora;
    }

    public Double calcularAlquiler() {
        if(this.anioDeFabricacion <=2020) {
            return precioBase;
        }
        else {
            return precioBase + valorAdicional;
        }
    }

    @Override
    public String toString() {
        return capitan + "\n" + precioBase + "$\n" + valorAdicional + "$\n" + anioDeFabricacion + "\n" + eslora +"mts";
    }
}
