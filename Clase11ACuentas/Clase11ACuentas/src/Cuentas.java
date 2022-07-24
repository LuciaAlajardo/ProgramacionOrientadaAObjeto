public abstract class Cuentas {
    private double saldo;
    private Integer nroCuenta;

    public Cuentas(Integer nroCuenta) {
        saldo = 0.0;
        this.nroCuenta = nroCuenta;
    }

    public void depositar(double monto){
        saldo += monto;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double informarSaldo(){ //aca va un get
        return saldo;
    }
    public abstract void extraer(double monto);

    @Override
    public String toString() { //toString metodo de consulta
        return "Soy una cuenta del tipo: " + getClass() + " y mi saldo es: " + informarSaldo();
    }

    @Override
    public int hashCode() { //a traves de un entero, identificar de manera única, un objeto/instancia en particular
        int hash = 11;
        hash = hash * nroCuenta.hashCode(); //el punto porque al nro de cuenta le pido su hash
        return hashCode();
    }

    @Override
    public boolean equals(Object otroobjeto) {
        if (otroobjeto == null){return false;}

        else if(!(otroobjeto instanceof Cuentas)) {
            return false;} //no es instancia de cuenta poreje es un perro

        Cuentas otraCuenta = (Cuentas) otroobjeto; //alt + enter= atajo para casteo.
        //con el casteo le decimos, java quedate tranquilo que yo se que otroobjeto es una cuenta

        return nroCuenta.equals(otraCuenta.nroCuenta);
    }
}
