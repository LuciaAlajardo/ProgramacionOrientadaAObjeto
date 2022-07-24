import animales.Gato;
import animales.Perro;
import animales.Persona;

public class Main {
    public static void main(String[] args) {

        // instancias
        Perro perro1 = new Perro("Zeke", "corto", 5, "calle");

        // para el equals declaramos otro perro

        Perro perro2 = new Perro("Zeke", "corto", 2, "calle");

        //  Animal perro1 = new Perro("Zeke", "corto", 2, "calle");
        // para castear esto, el casteo es para acceder a todos los metodos de clase padre e hijo

        // ((Perro)perro1).pasear que era el atributo del perro

        Gato gato1 = new Gato("pepito", "largo", 2);
        // aca no le paso el parametro porque
        //por defoult le pase que el gato estravieso "false"

        //dato con mayuscula, te devuelve el objeto llamado con el tipo de dato en mayuscula
        //en minuscula es el dato primitivo

        //asociación
        Persona juan = new Persona(perro1); //perro o gato



        System.out.println("Perro");
        perro1.comer();
        perro1.pasear();
        // hacemos uso de la sobrecarga
        perro1.pasear(" la plaza");
        perro1.hacerRuido();

        System.out.println("-----------------");

        System.out.println("Gato");
        gato1.hacerRuido();
        gato1.comer();
        System.out.println("es travieso " + gato1.setEsTravieso());
        gato1.setEsTravieso(false);
        System.out.println("es travieso " + gato1.setEsTravieso());

        // llamamos a persona, y accedemos a todos los atributos de perro por ejemplo

        juan.getMascota().getNombre();

        System.out.println("Nombre de la mascota de Juan " + juan.getMascota().getNombre());

        // CASTEO SI QUIERO SACAR A PASEAR EL GATO DE JUAN

        ((Perro)juan.getMascota()).pasear(); //lo casto porque juan no tiene una mascota sino, un animal.
        System.out.println(" Estoy paseando con la mascota de Juan ");





        int uno = 1;
        int dos = 2;

        if ( perro1 == perro2){ // en este caso lo que hace el == es comparar el espacio en memoria
            System.out.println("Son iguales");
        }
        else{
            System.out.println("No son iguales");
        }

        if ( perro1.equals(perro2)){ // para que sean iguales, tengo que establecer un parametro de igualdad
            System.out.println("Son iguales");
        }
        else{
            System.out.println("No son iguales");
        }
        // resumimos todo elEQUALS.

        System.out.println("------- Interface ----------");

        System.out.println("edad en anios humanos " + perro1.calcularEdadHumanos(perro1.getEdad()));
        perro1.mostrarEdad(perro1.getEdad());

        System.out.println("edad en anios humanos " + gato1.calcularEdadHumanos(gato1.getEdad()));
        gato1.mostrarEdad(gato1.getEdad());



    }
}