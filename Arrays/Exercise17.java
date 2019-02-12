public class Exercise17 {


    public static void main(String[] args) {

        int arr[] = {56, 78, 90, 56, 43, 23, 56, 78, 87, 100};
        int largest = arr[0];
        int secondLargest = arr[0];


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];

            }
        }

        System.out.println("Second largest number is: " + secondLargest);

    }
}





