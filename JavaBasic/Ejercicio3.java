import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float A = input.nextFloat();


        System.out.println("Enter the second number: ");
        float B = input.nextFloat();

        float result = A / B;

        System.out.println("The division of two numbers is: " + result);
    }
}
