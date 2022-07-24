public class Demo extends Juego implements Descargable{
    private Integer pesoEnMbs;

    public Demo(String nombre, Integer pesoEnMbs) {
        super(nombre, 0);
        this.pesoEnMbs = pesoEnMbs;
    }

    @Override
    public Double vender() {
        return 0.0; //la demo es gratis
    }

    @Override
    public void descargar(Integer velocidadDeDescargaEnMinutos) {
        System.out.println("Espere " + this.pesoEnMbs/velocidadDeDescargaEnMinutos + " minutos");
    }

    @Override
    public void jugarNivel() {
        if(getNivel() > 2){
            System.out.println("Para continuar compre la versión comptleta");
        }else {
            super.jugarNivel();
        }
    }
}
