import java.time.LocalTime;




public class Ejercicio5 {

    public static void main(String[] args) {


        LocalTime zone1 = LocalTime.now();

        System.out.println("Mexico time "+ (zone1));


        LocalTime nextTime = LocalTime.now().plusHours(6);

        System.out.println("GMT time "+ (nextTime ));

    }


    }


