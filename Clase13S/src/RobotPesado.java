public class RobotPesado extends SistemaArmas implements Voladores{

    public RobotPesado(Integer energia) {super(energia);}

    @Override
    public void volar() {
        System.out.println("Pueda alcanzar 1 metro de altura");
    }
}
