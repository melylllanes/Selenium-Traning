import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the  value of m: ");
        int m = input.nextInt();

        if (m > 0) {

            System.out.println(" The value of m=" + m + "\n" + " The value of n=1");

        } else if (m == 0) {

            System.out.println(" The value of m=" + m + "\n" + " The value of n=0");

        } else {
            System.out.println(" The value of m=" + m + "\n" + " The value of n=-1");

        }


    }
}
