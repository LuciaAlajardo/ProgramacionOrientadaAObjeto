public class OfertaAcademicaFactory {

    public static final String CODIGO_FRONT_END = "FRONTEND";
    public static final String CODIGO_BACKEND = "BACKEND";
    public static final String CODIGO_FULL_STACK = "FULLSTACK";
    private static OfertaAcademicaFactory instance;

    private OfertaAcademicaFactory() {
    }

    public static OfertaAcademicaFactory getInstance() {
        if(instance == null){
            instance = new OfertaAcademicaFactory();
        } return instance;
    }
    public OfertaAcademica crearOfertaAcademica(String codigo){
        switch (codigo){
            case CODIGO_FRONT_END :
                return new Curso ("Front-end", "JavaScript es de hippie", 1000.0, 16.0,2.0);
            case CODIGO_BACKEND :
                return new Curso("Back-End", "Aguante java", 900.0, 20.0, 2.0);
            case CODIGO_FULL_STACK :
                ProgramaIntensivo programaIntensivo = new ProgramaIntensivo("Full-strack", "completo", 0.2);
                programaIntensivo.agregarOferta(crearOfertaAcademica(CODIGO_FRONT_END));
                programaIntensivo.agregarOferta(crearOfertaAcademica(CODIGO_BACKEND));
                return programaIntensivo;
        }
        return null;
    }
}
