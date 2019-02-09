import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" Primer numero: ");
        int num1 = input.nextInt();

        System.out.print(" Segundo numero: ");
        int num2 = input.nextInt();

        int suma = num1 + num2;
        int mult = num1 * num2;
        int div = num1 / num2;
        int rest = num1 - num2;
        int mod = num1 % num2;


        System.out.println(" La suma de  los dos numero es: " + suma);
        System.out.println(" La multiplicacion de  los dos numero es: " + mult);
        System.out.println(" La division de  los dos numero es: " + div);
        System.out.println(" La resta de  los dos numero es: " + rest);
        System.out.println(" El mod de  los dos numero es: " + mod);



    }
}
