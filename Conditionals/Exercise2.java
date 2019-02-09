import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value of A: ");
        float a = input.nextFloat();

        System.out.println("Enter value of B: ");
        float b = input.nextFloat();

        System.out.println("Enter value of C: ");
        float c = input.nextFloat();

        double result = Math.pow(b,2) - 4 * a * c;

        if (result > 0) {
            double result1 = (-b + Math.sqrt(result))/ (2 *a);
            double result2 = (-b - Math.sqrt(result))/ (2 *a);
            System.out.println("The roots are " + result1 + " and " + result2);

        } else if (result == 0) {
            double result1 = -b / (2 * a);
            System.out.println("The root is " + result1);

        } else {
            System.out.println("The equation has no  roots.");
        }

    }

}
