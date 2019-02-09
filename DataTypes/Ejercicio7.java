import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("How much distance did you travel: ");
        float meters = input.nextFloat();

        System.out.print("In how many hours: ");
        float hours = input.nextFloat();

        System.out.print("In how many minutes: ");
        float minutes = input.nextFloat();

        System.out.print("In how many seconds: ");
        float seconds = input.nextFloat();

        float timeToSeconds = ((hours * 3600) + (minutes * 60) + seconds);
        float metersPerSecond = meters / timeToSeconds;
        float kiloMetersPerHour = (meters / 1000) / (timeToSeconds / 3600);
        float milesPerHour = (meters / 1609) / (timeToSeconds / 3600);

        System.out.println(" ");
        System.out.println("Your speed in meters/second is: " + metersPerSecond);
        System.out.println("Your speed in km/h is: " + kiloMetersPerHour);
        System.out.println("Your speed in miles/h: " + milesPerHour);
    }
}
