public class UnidadDeTrabajoFactory {

    public static final String MANTENIMIENTO = "Mantenimiento";
    public static final String LIMPIEZA = "Limpieza";
    public static final String SERVICIOS_GENERALES = "Servicios Generales";
    private static UnidadDeTrabajoFactory instance;

    private UnidadDeTrabajoFactory(){}

    public static UnidadDeTrabajoFactory getInstance(){
        if (instance == null){
            instance = new UnidadDeTrabajoFactory();
        }return instance;
    }
    public UnidadDeTrabajo crearUnidadDeTrabajo(String codigo){
        switch (codigo){
            case MANTENIMIENTO:
                return new UnidadDeTrabajoSimple("Mantenimiento", "jjjj", 120000.0, 4);

            case LIMPIEZA:
                return new UnidadDeTrabajoSimple("Limpieza", "kkkk",100000.0, 24);

            case SERVICIOS_GENERALES:
                UnidadDeTrabajoCombinada unidadDeTrabajoCombinada = new UnidadDeTrabajoCombinada("Servicios Generales","jll", 3, 4.5);
                unidadDeTrabajoCombinada.agregarUnidadDeTrabajo(crearUnidadDeTrabajo(MANTENIMIENTO));
                unidadDeTrabajoCombinada.agregarUnidadDeTrabajo(crearUnidadDeTrabajo(LIMPIEZA));

                return unidadDeTrabajoCombinada;
        }
        return null;
    }
}
