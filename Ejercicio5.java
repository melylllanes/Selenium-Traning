import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" Primer numero: ");
        int num1 = input.nextInt();

        System.out.print(" Segundo numero: ");
        int num2 = input.nextInt();

        int result = num1 + num2;

        System.out.println(" La suma de  los dos numero es: " + result);

    }

}
