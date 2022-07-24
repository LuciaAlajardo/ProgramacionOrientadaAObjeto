public class Velero extends Embarcacion{
    private Integer cantDeMastiles;

    public Velero(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioDeFabricacion, Double eslora, Integer cantDeMastiles) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, eslora);
        this.cantDeMastiles = cantDeMastiles;
    }

    public Boolean esGrande(){
        return this.cantDeMastiles > 4;
    }
}
