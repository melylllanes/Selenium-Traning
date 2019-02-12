import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numberArray = new int[5];
        System.out.println("Enter the elements into the array:");

        for (int i = 0; i < numberArray.length; i++) {

            numberArray[i] = input.nextInt();
        }

        System.out.println("Array in reverse: ");

        for (int i = numberArray.length - 1; i >= 0; i--){

            System.out.print(numberArray[i]+" ");
        }
    }

}
