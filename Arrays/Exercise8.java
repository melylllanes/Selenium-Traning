import java.util.Arrays;

public class Exercise8 {
    public static void main(String[] args) {

        String[] array = {"Apple", "Orange", "Watermelon", "Strawberry"};

        String [] newArray = new String [4];

        System.out.println("Original Array : " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {

            newArray[i] = array[i];
        }

        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}

