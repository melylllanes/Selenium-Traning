public class Exercise18 {


    public static void main(String[] args) {

        int arr[] = {56, 78, 90, 56, 43, 23, 56, 78, 87, 100};
        int smallest = arr[0];
        int secondSmallest = arr[0];


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];

            } else if (arr[i] < secondSmallest) {
                secondSmallest = arr[i];

            }
        }

        System.out.println("Second smallest number is: " + secondSmallest);

    }
}


