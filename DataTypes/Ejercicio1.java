import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" What is the temperature in Fahrenheit: ");
        float F = input.nextFloat();

        double C = (F - 32) / 1.8;

        System.out.println(" The temperature in Celsius is: " + C);
    }

}
