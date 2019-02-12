public class Exercise14 {

    public static void main(String[] args) {

        String[] arr1 = {"Melissa", "Amy", "Luis", "Abner"};
        String[] arr2 = {"Marlene", "Enrique", "Isela", "Amy", "Luis"};

        System.out.println("Common elements: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equalsIgnoreCase(arr2[j])) {
                    System.out.println(arr1[i]);
                }

            }
        }
    }
}



