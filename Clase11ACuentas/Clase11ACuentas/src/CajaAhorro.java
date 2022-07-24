public class CajaAhorro extends Cuentas{
    public CajaAhorro(Integer nroCuenta) {
        super(nroCuenta);
    }

    public static final double INTERES_CAJA_AHORRO = 1.2;

    public void cobrarIntereses(){
        setSaldo(informarSaldo() * CajaAhorro.INTERES_CAJA_AHORRO);
    }

    @Override
    public void extraer(double monto){
        if (informarSaldo() >= monto){
            setSaldo(informarSaldo() - monto);
        }
    }
}
