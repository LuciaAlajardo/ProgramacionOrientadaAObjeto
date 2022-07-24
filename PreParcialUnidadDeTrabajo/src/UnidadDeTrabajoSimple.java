public class UnidadDeTrabajoSimple extends UnidadDeTrabajo {
    private Double montoPorPersona;
    private Integer cantidadDePersonas;

    public UnidadDeTrabajoSimple(String nombre, String descripcion, Double montoPorPersona, Integer cantidadDePersonas) {
        super(nombre, descripcion);
        this.montoPorPersona = montoPorPersona;
        this.cantidadDePersonas = cantidadDePersonas;
    }

    @Override
    public Double calcularMonto() {
        if (cantidadDePersonas > 10) {
            return montoPorPersona * cantidadDePersonas * 1.2; // porque si le digo que retorne el
            // mom¡nto por porsona *1.2, si tengo 11 personas me devuelve por el monto de una
        } else {
            return  montoPorPersona * cantidadDePersonas;

        }
    }
}