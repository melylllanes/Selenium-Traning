import java.util.Arrays;
import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] listOfStudents = new String[5];


        for (int i = 0; i < listOfStudents.length; i++) {

            System.out.print("Please insert the name of the student: " + (i+1) + ": ");
            listOfStudents[i] = input.nextLine();

        }
        System.out.println("The name of the students are: " + Arrays.toString(listOfStudents));
    }
}

