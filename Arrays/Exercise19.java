public class Exercise19 {

    public static void main(String args[]) {

        int matrix1[][] = {{5, 6, 7}, {2, 4, 9}, {3, 4, 5}};
        int matrix2[][] = {{1, 6, 6}, {7, 4, 3}, {1, 7, 4}};

        int sumOfMatrix[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                sumOfMatrix[i][j] = matrix1[i][j] + matrix2[i][j];

                System.out.print(sumOfMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

