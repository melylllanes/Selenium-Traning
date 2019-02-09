import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {


        int sum = 0;

        Scanner input = new Scanner(System.in);


        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter number " + i + ":");
            int num = input.nextInt();

            sum += i;

        }

        System.out.println("The sum of 5 numbers is :" + sum);
        System.out.println("The average is: " + sum / 5);

    }
}
