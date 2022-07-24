public class RobotLiviano extends SistemaArmas implements Voladores{
    public RobotLiviano(Integer energia) {
        super(energia);
    }

    @Override
    public void volar() {
        System.out.println("Puede alcanza 3 metros de altura");
    }
}
