public class Exercise13 {

    public static void main(String[] args) {


        String[] arrayOfStrings = {"Hello", "Hi", "Whats up", "Hi"};
        int count = 0;

        for (int i = 0; i < arrayOfStrings.length; i++) {
            for (int j = i + 1; j < arrayOfStrings.length; j++) {
                if (arrayOfStrings[i].equalsIgnoreCase(arrayOfStrings[j])) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("Duplicated word: " + arrayOfStrings[i]);
                count = 0;
            }


        }
    }
}

