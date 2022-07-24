public class ExamenParcial extends Examen {
    private int unidad;
    private int nroDeReintento;

    public ExamenParcial(String titulo, String enunciado, Double nota, int unidad, int nroDeReintento) {
        super(titulo, enunciado, nota);
        this.unidad = unidad;
        this.nroDeReintento = nroDeReintento;
        if(unidad <= 3){
            this.nroDeReintento = 3;
        }else {this.nroDeReintento = 2;
    }

    public void recuperarExamen(){
            if (nroDeReintento > 0){
                nroDeReintento --;
            }else {
                System.out.println(" ya no se puede recuperar ");
            }
        }

    }
    public boolean puedeRecuperar(){
        return nroDeReintento > 0;
    }
}
