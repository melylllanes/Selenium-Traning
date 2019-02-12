import java.util.Arrays;

public class Exercise1 {

    public static void main(String[] args) {

        String[] StringArray = {"purple", "green", "blue", "yellow", "brown"};
        int[] NumberArray = {23, 67, 12, 76, 89, 45, 43, 6};


        Arrays.sort(NumberArray);
        System.out.println("Sorted numeric array: \n" + Arrays.toString(NumberArray));
        System.out.println("------------------------------------------------------------");
        Arrays.sort(StringArray);
        System.out.println("Sorted String array: \n" + Arrays.toString(StringArray));


    }
}




