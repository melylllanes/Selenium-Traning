import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Up to what number do you want to enter: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {


            double cubeNumber = Math.pow(i, 3);


            System.out.println("The number is " + i + ":" + " and the cube of the number " + i + ": " + cubeNumber);


        }


    }

}
