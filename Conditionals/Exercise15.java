import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {

        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("How many odd number do you want to see: ");
        int oddNumbers = input.nextInt();

        System.out.println("The odd number are: ");
        for (int i = 1; i <= oddNumbers; i++) {

            int result = i *2 -1;
            System.out.println(result);
            sum = sum + result;

        }
        System.out.println("The Sum of odd Natural Number upto " + oddNumbers + " terms is: " + sum);
    }
}