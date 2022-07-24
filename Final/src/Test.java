public class Test {
    public static void main(String[] args) {
        Personaje personaje = new Personaje();

        HabilidadFactory habilidadFactory = HabilidadFactory.getInstance();

        personaje.agregarHabilidad(habilidadFactory.crearHabilidad(habilidadFactory.SALTAR));
        personaje.agregarHabilidad(habilidadFactory.crearHabilidad(habilidadFactory.DISPARAR));
        personaje.agregarHabilidad(habilidadFactory.crearHabilidad(habilidadFactory.DISPARO_AL_SALTAR));

        personaje.mostrarHabilidad();

    }
}