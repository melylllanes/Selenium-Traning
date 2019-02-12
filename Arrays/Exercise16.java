import java.util.Arrays;

public class Exercise16 {

    private static int[] removeDuplicates(int[] arr) {


        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                arr[i] = 0;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8};

        System.out.println(Arrays.toString(arr));

        int[] tempArr = removeDuplicates(arr);

        System.out.println(Arrays.toString(tempArr));
    }


}

