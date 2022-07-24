public class CuentaCorriente extends Cuentas{
    private double descuentoPermitido;

    public CuentaCorriente(Integer nroCuenta) {
        super(nroCuenta);
        this.descuentoPermitido = descuentoPermitido;
    }

    public double getDescuentoPermitido(){
        return descuentoPermitido;
    }
    public void setDescuentoPermitido(double descuentoPermitido){
        this.descuentoPermitido = descuentoPermitido;
    }
    @Override
    public void extraer(double monto){
        if (informarSaldo() + descuentoPermitido >= monto){
            setSaldo(informarSaldo() - monto);
        }
    }
}
