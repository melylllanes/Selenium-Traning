import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 3, 2};

        Scanner input = new Scanner(System.in);

        System.out.println("What number from the array do you want the index of:");
        int number = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                System.out.println("The index of " + number + " is " + (i + 1));
                break;
            }

        }
    }
}