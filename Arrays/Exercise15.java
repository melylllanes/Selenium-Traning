public class Exercise15 {

    public static void main(String[] args) {

        int[] arr1 = {1, 5, 76, 56, 89, 9, 34};
        int[] arr2 = {54, 7, 90, 34, 89, 5, 45, 78};


        System.out.println("Common elements: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }

            }
        }
    }
}


