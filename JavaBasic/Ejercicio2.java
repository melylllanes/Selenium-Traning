import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int A = input.nextInt();


        System.out.println("Enter the second number: ");
        int B = input.nextInt();

        int result = A + B;

        System.out.println("The sum of two number is: " + result);

    }

    }
