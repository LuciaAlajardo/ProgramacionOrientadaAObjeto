public class UnidadSimple extends UnidadDeTrabajo{
    private Double montoPorPersona;
    private Integer cantDePersonas;

    public UnidadSimple(String nombre, String descripcion, Double montoPorPersona, Integer cantDePersonas) {
        super(nombre, descripcion);
        this.montoPorPersona = montoPorPersona;
        this.cantDePersonas = cantDePersonas;
    }

    @Override
    public Double calcularMonto() {
        if (cantDePersonas>10){
            return montoPorPersona*cantDePersonas*1.2;
        }
        else{
            return montoPorPersona*cantDePersonas;
        }
    }
}
