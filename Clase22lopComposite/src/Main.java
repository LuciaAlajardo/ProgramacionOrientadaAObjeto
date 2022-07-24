import javax.swing.event.ChangeListener;

public class Main {
    public static void main(String[] args) {


        Producto hamburguesa = new Producto("Hamburguesa",3.0);
        Producto gaseosa = new Producto("Gaseosa",1.0);
        Producto papasFritas = new Producto("Papas Fritas",2.0);
        Producto helado = new Producto("Helado",1.5);

        Combo comboUno = new Combo(0.10);
        comboUno.agregarComprable(hamburguesa);
        comboUno.agregarComprable(gaseosa);
        comboUno.agregarComprable(papasFritas);

        Combo comboDos = new Combo(0.20);
        comboDos.agregarComprable(comboUno);
        comboDos.agregarComprable(comboUno);

        Combo comboTres = new Combo(0.25);
        comboTres.agregarComprable(comboUno);
        comboTres.agregarComprable(comboDos);
        comboTres.agregarComprable(helado);
        comboTres.agregarComprable(helado);
        comboTres.agregarComprable(helado);

        Carrito carrito = new Carrito();
        carrito.agregarComprable(comboUno);
        carrito.agregarComprable(comboDos);
        carrito.agregarComprable(papasFritas);
        carrito.agregarComprable(comboTres);

        System.out.println(carrito.calcularPrecioTotal());

    }
}