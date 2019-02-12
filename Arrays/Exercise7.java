import java.util.Arrays;

public class Exercise7 {

    public static void main(String[] args) {
        int[] numberArray = {45,87,90,73,45,32,54};

        System.out.println("Original Array : " + Arrays.toString(numberArray));

        int numberToRemove = 2;

        for (int i = numberToRemove; i < numberArray.length - 1; i++) {

            numberArray[i] = numberArray[i + 1];
        }
        System.out.println("After removing the third element: " + Arrays.toString(numberArray));
    }
}
