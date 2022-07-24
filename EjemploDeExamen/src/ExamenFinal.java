public class ExamenFinal extends Examen implements Comparable{
    private int notaOral;
    private String temaOral;

    public ExamenFinal(String titulo, String enunciado, Double nota, int notaOral, String temaOral) {
        super(titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.temaOral = temaOral;
    }

    public boolean estaAprobado() {
        return false;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
