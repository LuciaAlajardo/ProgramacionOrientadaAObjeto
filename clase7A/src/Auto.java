public class Auto {

    private String patente;
    private String marca;
    private String modelo;


    public Auto(String patente, String marca, String modelo){
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;

    }
    // para acceder a estos atributos
    public String getPatente(){
        return patente;
    }
}
