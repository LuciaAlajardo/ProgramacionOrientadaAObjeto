public class Main {
    public static void main(String[] args) {

        CajaAhorro unaCajaAhorro = new CajaAhorro(123);
        unaCajaAhorro.setSaldo(100);
        unaCajaAhorro.cobrarIntereses();

        System.out.println("El saldo de la caja de ahorro es: " + unaCajaAhorro.informarSaldo());

        System.out.println(unaCajaAhorro.toString());

        CuentaCorriente unaCuentaCorriente = new CuentaCorriente(123);

        System.out.println("Si comparamos las dos cuentas que tengo, son iguales? Respuesta:" + unaCuentaCorriente.equals(unaCuentaCorriente) );

        Cuentas unaCuenta = new CajaAhorro(122);
        unaCuenta.setSaldo(50);
        unaCuenta.extraer(10.0);


        System.out.println("Soy una caja de ahorro, me extrajero 10, mi saldo es: " + unaCuenta.informarSaldo());

        System.out.println("--------------------------");

        //cambio en el sistema

        unaCuenta = new CuentaCorriente(1010);
        ((CuentaCorriente)unaCuenta).setDescuentoPermitido(5); //casteo main

        unaCuenta.setSaldo(5);
        unaCuenta.extraer(10.0);

        System.out.println("Soy una Cuenta Corriente de ahorro, me extrajero 10, mi saldo es: " + unaCuenta.informarSaldo());

    }


}