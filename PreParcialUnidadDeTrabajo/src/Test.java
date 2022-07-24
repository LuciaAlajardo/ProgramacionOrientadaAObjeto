public class Test{
    public static void main(String[] args) {
      Empresa empresa = new Empresa();
      UnidadDeTrabajoFactory unidadDeTrabajoFactory = UnidadDeTrabajoFactory.getInstance();

      empresa.agregarUnidadDeTrabajo(unidadDeTrabajoFactory.crearUnidadDeTrabajo(unidadDeTrabajoFactory.MANTENIMIENTO));
      empresa.agregarUnidadDeTrabajo(unidadDeTrabajoFactory.crearUnidadDeTrabajo(unidadDeTrabajoFactory.LIMPIEZA));
      empresa.agregarUnidadDeTrabajo(unidadDeTrabajoFactory.crearUnidadDeTrabajo(unidadDeTrabajoFactory.SERVICIOS_GENERALES));

      empresa.mostrarUnidadDeTrabajo();

    }
}