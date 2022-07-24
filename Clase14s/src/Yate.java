public class Yate extends Embarcacion implements Comparable{
    private Integer cantDeCamarotes;

    public Yate(Capitan capitan, Double precioBase, Double valorAdicional, Integer anioDeFabricacion, Double eslora, Integer cantDeCamarotes) {
        super(capitan, precioBase, valorAdicional, anioDeFabricacion, eslora);
        this.cantDeCamarotes = cantDeCamarotes;
    }

    @Override
    public int compareTo(Object o) {
        if(this.cantDeCamarotes > ((Yate)o).cantDeCamarotes) {
            return 1;
        } else if (this.cantDeCamarotes < ((Yate)o).cantDeCamarotes) {
            return -1;
        } else {
            return 0;
        }
    }
}
