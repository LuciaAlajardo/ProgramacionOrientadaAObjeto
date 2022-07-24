public class UnidadDeTrabajoFactory {
    public static final String MANTENIMIENTO = "MANTENIMIENTO";
    public static final String LIMPIEZA = "LIMPIEZA";
    public static final String SERVICIOS_GENERALES = "SERVICIOS_GENERALES";
    private static UnidadDeTrabajoFactory instance;

    private UnidadDeTrabajoFactory(){

    }

    public static UnidadDeTrabajoFactory getInstance() {
        if (instance==null){
            instance= new UnidadDeTrabajoFactory();
        }
        return instance;
    }
    public UnidadDeTrabajo crearUnidadDeTrabajo(String codigo){
        switch (codigo){
            case MANTENIMIENTO: return new UnidadSimple("Mantenimiento","blablabla",120.0,4);
            case LIMPIEZA: return new UnidadSimple("Limpieza","bka",100.0,24);

            case SERVICIOS_GENERALES:
                UnidadCompuesta unidadCompuesta= new UnidadCompuesta("Servicios Generales","blbalbla",3.0,4.5);
                unidadCompuesta.agregarUnidadDeTrabajo(crearUnidadDeTrabajo(MANTENIMIENTO));
                unidadCompuesta.agregarUnidadDeTrabajo(crearUnidadDeTrabajo(LIMPIEZA));
                return unidadCompuesta;

        }
        return null;

    }

}

