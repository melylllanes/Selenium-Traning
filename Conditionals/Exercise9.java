import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        int numOfDays = 0;

        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a leap year ");

        } else {
            System.out.println(year + " is not a leap year");
        }

    }

}
