import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int maxNumber = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter number " + i + ":");
            int num = input.nextInt();

            if (num > maxNumber) {

                maxNumber = num;

            }
        }
        System.out.println("The greates number is: " + maxNumber);
    }


}
