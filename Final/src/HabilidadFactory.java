public class HabilidadFactory {

    public static final String SALTAR = "Saltar";
    public static final String DISPARAR = "Disparar";
    public static final String DISPARO_AL_SALTAR = "Disparo-al-saltar";
    private static HabilidadFactory instance;

    public HabilidadFactory() {
    }

    public static HabilidadFactory getInstance() {
        if (instance == null) {
            instance = new HabilidadFactory();
        }
        return instance;
    }

    public Habilidad crearHabilidad(String codigo) {
        switch (codigo) {
            case SALTAR:
                return new HabilidadSimple("Saltar", "Salta-Salta", 7.5);
            case DISPARAR:
                return new HabilidadSimple("Disparar", "piu-piu", 10.0);
            case DISPARO_AL_SALTAR:
                HabilidadCombinada habilidadCombinada = new HabilidadCombinada("Disparo al saltar", "Salto piu-piu", 3);
                habilidadCombinada.agregarHabilidad(crearHabilidad(SALTAR));
                habilidadCombinada.agregarHabilidad(crearHabilidad(DISPARAR));

                return habilidadCombinada;
        }
        return null;


    }
}