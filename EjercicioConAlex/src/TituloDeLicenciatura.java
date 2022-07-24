import java.util.Date;

public class TituloDeLicenciatura extends Titulo implements Comparable{
    private String temaTesis;
    private Date fechaEntregaDeTesis;
    private Integer cantidadDeTrabajoDeInvestigacion;

    public TituloDeLicenciatura(Persona dueño, Integer cantidadDeMaterias, Date fechaInicioCarrera, Date fechaFinalCarrera, boolean selloIntitucion, boolean selloMinisterio, String temaTesis, Date fechaEntregaDeTesis, Integer cantidadDeTrabajoDeInvestigacion) {
        super(dueño, cantidadDeMaterias, fechaInicioCarrera, fechaFinalCarrera, selloIntitucion, selloMinisterio);
        this.temaTesis = temaTesis;
        this.fechaEntregaDeTesis = fechaEntregaDeTesis;
        this.cantidadDeTrabajoDeInvestigacion = cantidadDeTrabajoDeInvestigacion;
    }

    public Integer getCantidadDeTrabajoDeInvestigacion() {
        return cantidadDeTrabajoDeInvestigacion; //
    }

    /*@Override
    public int compareTo(Object o) { //aca hay tres resultados posibles, >= o <:
        // se castea titulo de licenciatura, porque el objeto no tiene nada, casteamos a lic porque sus variables son privada
        // aca nos comparamos a nosotros con otro objeto.
        if (this.cantidadDeTrabajoDeInvestigacion > ((TituloDeLicenciatura)o).getCantidadDeTrabajoDeInvestigacion()){
            return
        }*/

        //para no repetir casteo
        @Override
        public int compareTo(Object o) {
            TituloDeLicenciatura titulo = (TituloDeLicenciatura) o;
            if (this.cantidadDeTrabajoDeInvestigacion > titulo.getCantidadDeTrabajoDeInvestigacion()) {
                return 1;
            } else if (this.cantidadDeTrabajoDeInvestigacion < titulo.getCantidadDeTrabajoDeInvestigacion()){
                return -1;
            } else {
                return 0;
            }
       }
       public void diferenciar(TituloDeLicenciatura t){
            int resultado = compareTo(t);

           if (resultado < 0) {
               System.out.println(" es mas grande ");
           } else if (resultado > 0) {
               System.out.println(" es mas chico");
           }else {
               System.out.println("son iguales");
           }
       }
}
