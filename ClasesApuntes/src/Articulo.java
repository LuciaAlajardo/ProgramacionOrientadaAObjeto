public class Articulo {
    // Aca creamos atributos
    private String descripcion;
    private double precioVenta;
    private int stock;

    //Aca creamos el metodo constructor

    public Articulo (String descripcion, double precio, int stock){
        //aca, antes del = van los atributos luego los parametros del constructor
        // (si tiene el mismo nombre que el argumento de mi constructor,hay que colocar this.
        this.descripcion=descripcion;
        precioVenta=precio;
        this.stock=stock;
    }

    //Ahora tenemos que hacer el SET y GET para el primer atributo "descripcion"

    public void setDescripcion (String descripcion){
        this.descripcion=descripcion;
    }
    public String getDescripcion (){
        return descripcion;
    }

    //SET Y GET para precioVenta

    public void setPrecioVenta (double precio){
        precioVenta=precio;
    }
    public double getPrecioVenta (){
        return precioVenta;
    }
    //SET Y GET para stock

    public void setStock (int stock){
        this.stock=stock;
    }
    public int getStock (){
        return stock;
    }

    //ahora creo dos metodos mas

    public boolean hayStock(){
        return stock>0;
    }

    public double consultarPrecio(){
        return precioVenta;
    }


}


