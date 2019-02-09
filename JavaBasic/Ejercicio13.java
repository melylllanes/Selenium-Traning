import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Give me the value of the width of the rectangle: ");
        float W = input.nextFloat();


        System.out.println("Give me the value of the height of the rectangle: ");
        float L = input.nextFloat();

        float Area = L * W;
        float Perimeter = 2 * (L + W);

        System.out.println("The area of the rectangle is " + Area + " and the perimeter is " + Perimeter);
    }
}
