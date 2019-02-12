import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = {3, 6, 7, 6, 3};
        int total = 0;


        for (int i = 0; i < numbers.length; i++) {


            total = total + numbers[i];

        }


        System.out.println("The average of the " + numbers.length + " numbers is: " + total/numbers.length);
    }
}

