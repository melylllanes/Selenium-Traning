import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Give me the amount of minutes: ");

        int minutes = input.nextInt();

        if (minutes >= 525600) {

            int years = minutes / 525600;
            int days = (minutes % 525600) / 1440;

            System.out.println(years + " Years " + days + " days ");
        } else if (minutes >= 1440) {

            int days = minutes / 1440;
            System.out.println(days + " days ");


        } else {

            System.out.println("It does not complete a day. ");
        }

    }
}
