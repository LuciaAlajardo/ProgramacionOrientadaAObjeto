import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Lopez", "2222", 22);
        TituloTerciario tt = new TituloTerciario(persona, 3, new Date(), new Date(),
                true, true, TituloTerciario.VALID_NACIONAL);

        TituloDeLicenciatura tl1 = new TituloDeLicenciatura(new Persona("Jose", "Perez", "323232", 23),
                3, new Date(), new Date(), true, false,
                "Progra", new Date(), 4 );

        TituloDeLicenciatura tl2 = new TituloDeLicenciatura(new Persona("Nicolas", "Perez", "323232", 23),
                3, new Date(), new Date(), true, true,
                "Progra", new Date(), 2 );


        //System.out.println(tl1.compareTo(tl2)); //hasta aca nos devuelve el numero del overra.. del tl.


        // si queisiera que me devuelva que titulo es mas grande, voy a la que tiene el compareto

        //tl1.diferenciar(tl2);
        // pero como le decimos que compare con tl hay que castearlo

        tl1.diferenciar((TituloDeLicenciatura) tl2);
        System.out.println(tl1.puedeEjercer());
        System.out.println(tt.puedeEjercer());
        System.out.println(tt.esValidoANivelNaciional());

    }
}