public class Exercise3 {


    public static void main(String[] args) {

        String[][] arr = new String[10][10];


        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {

                arr[i][j] = " - ";

                System.out.print(arr[i][j]);
            }
            System.out.println();

        }

    }

}
