import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Capitan miCapitan = new Capitan("Maxi", "Miliano", "23sa");
        Velero v = new Velero(miCapitan,100.00, 30.0, 2018, 10.0, 3 );
        Yate y = new Yate(new Capitan("Jorge", "Meconio", "232sw"), 140.0, 120.0, 2021, 23.0, 6);
        Embarcacion y2 = new Yate(miCapitan,100.00, 30.0, 2022, 10.0, 500 );
        System.out.println(v);
        System.out.println(y);
        System.out.println(y.compareTo(y2));
    }
}
