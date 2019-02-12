import java.util.Arrays;

public class Exercise10 {

    public static void main(String[] args) {

        int[] arrayOfNumbers = {55, 78, 45, 67, 23, 90};

        Arrays.sort(arrayOfNumbers);
        System.out.println("The minimum value is: " + arrayOfNumbers[0]);
        System.out.println("The maximum value is: " + arrayOfNumbers[5]);

    }
}
