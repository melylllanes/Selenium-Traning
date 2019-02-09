import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        double square = Math.pow(number,2);
        double cube = Math.pow(number,3);
        double fourthPower = Math.pow(number,4);



        System.out.println("Square: " + square);
        System.out.println("Cube: " + cube);
        System.out.println("Fourth power: " + fourthPower);
    }


}
