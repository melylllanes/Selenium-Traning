import java.util.Scanner;

public class Exercise6 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first decimal number: ");
        float num1 = input.nextFloat();

        System.out.println("Enter the second decimal number: ");
        float num2 = input.nextFloat();

        if (num1 == num2) {

            System.out.println("They are equal.");
        } else {
            System.out.println("They are different.");
        }
    }

}
