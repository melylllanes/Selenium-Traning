import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println(" What is the value in inches: ");
        float inches = input.nextFloat();

        double meters = inches * 0.0254;

        System.out.println(" The value in meters is: " + meters);


    }

}
