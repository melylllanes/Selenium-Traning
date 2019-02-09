import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = 3;
        int[] numbers = new int[n];
        float total = 0;


        for (int i =0; i < 3; i++) {

            System.out.println("Please type the number " + (i+1) + ":");
            numbers[i] = input.nextInt();

            total = total + numbers[i];

        }


        System.out.println("The average of the 3 number is: " + total / n);
    }
}