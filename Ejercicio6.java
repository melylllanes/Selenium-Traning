import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter de weight in pounds: ");
        float pounds = input.nextFloat();

        System.out.println("Please enter de weight in inches: ");
        float inches = input.nextFloat();

        double KG = ( pounds * 0.453592);
        double M = ( inches * 0.0254);

        double BMI = KG / Math.pow(M,2);

        System.out.println(" The Body Mass Index is: " + BMI);





    }

}
