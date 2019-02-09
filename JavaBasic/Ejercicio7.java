import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Cual tabla de multiplicacion deseas desplegar: ");
        int numero = input.nextInt();

        for (int i = 1; i <= 10; i++) {


            System.out.println(numero + " x " + i + " = " + numero * i);


        }

    }

}
