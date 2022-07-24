import java.util.Date;

public class TituloTerciario extends Titulo{
    private String validacion;
    public static final String VALID_NACIONAL = "NACIONAL"; //VARIABLES PUBLICA, ESTATICA,
    // SE VE DESDE LA CLASE Y NO DESDE LA INSTANCIA Y PARA ACCEDER HAY QUE HACER
    // (TITULO TERCIARIO. VALID NACION, ES FINAL ES DECIR, NO SE PUEDE MODIFICAR.
    public static final String VALID_PROVINCIA = "PROVINCIA";

    public TituloTerciario(Persona dueño, Integer cantidadDeMaterias, Date fechaInicioCarrera, Date fechaFinalCarrera, boolean selloIntitucion, boolean selloMinisterio, String validacion) {
        super(dueño, cantidadDeMaterias, fechaInicioCarrera, fechaFinalCarrera, selloIntitucion, selloMinisterio);
        this.validacion = validacion;
    }

    // si es valido a nivel nacional

    public boolean esValidoANivelNaciional(){
        return validacion == VALID_NACIONAL;
}
}
