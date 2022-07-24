public class Test {
    public static void main(String[] args) {
        Empresa LopiSA = new Empresa();
        UnidadDeTrabajoFactory unidadDeTrabajoFactory = UnidadDeTrabajoFactory.getInstance();
        LopiSA.agregarUnidadDeTrabajo(unidadDeTrabajoFactory.crearUnidadDeTrabajo(UnidadDeTrabajoFactory.MANTENIMIENTO));
        LopiSA.agregarUnidadDeTrabajo(unidadDeTrabajoFactory.crearUnidadDeTrabajo(UnidadDeTrabajoFactory.LIMPIEZA));
        LopiSA.agregarUnidadDeTrabajo(unidadDeTrabajoFactory.crearUnidadDeTrabajo(UnidadDeTrabajoFactory.SERVICIOS_GENERALES));
        LopiSA.mostrarUnidadesDeTrabajo();
    }
}