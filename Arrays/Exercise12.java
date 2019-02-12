public class Exercise12 {


    public static void main(String[] args) {


        int[] arrayOfNumbers = {55, 78, 45, 67, 23, 45};
        int count = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = i + 1; j < arrayOfNumbers.length; j++) {
                if (arrayOfNumbers[i] == arrayOfNumbers[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("Duplicated number: " + arrayOfNumbers[i]);
                count = 0;
            }


        }
    }
}