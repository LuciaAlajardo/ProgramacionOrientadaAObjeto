public class Main {
    public static void main(String[] args) {
        Instituto instituto = new Instituto();

        OfertaAcademicaFactory ofertaAcademicaFactory = OfertaAcademicaFactory.getInstance();

        instituto.agregarOferta(ofertaAcademicaFactory.crearOfertaAcademica(ofertaAcademicaFactory.CODIGO_FRONT_END));
        instituto.agregarOferta(ofertaAcademicaFactory.crearOfertaAcademica(ofertaAcademicaFactory.CODIGO_BACKEND));
        instituto.agregarOferta(ofertaAcademicaFactory.crearOfertaAcademica(ofertaAcademicaFactory.CODIGO_FULL_STACK));


        instituto.generarInforme();


    }
}