import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of the month: ");
        int numOfMonth = input.nextInt();

        System.out.print("Enter the number of the year: ");
        int year = input.nextInt();

        int numOfDays = 0;
        String nameOfMonth = "";


        switch (numOfMonth) {
            case 1:
                nameOfMonth = "January";
                numOfDays = 31;
                break;
            case 2:
                nameOfMonth = "February";

                if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400==0))) {
                    numOfDays = 29;
                } else {
                    numOfDays = 28;
                }

                break;
            case 3:
                nameOfMonth = "March";
                numOfDays = 31;
                break;
            case 4:
                nameOfMonth = "April";
                numOfDays = 30;
                break;
            case 5:
                nameOfMonth = "May";
                numOfDays = 31;
                break;
            case 6:
                nameOfMonth = "June";
                numOfDays = 30;
                break;
            case 7:
                nameOfMonth = "July";
                numOfDays = 31;
                break;
            case 8:
                nameOfMonth = "August";
                numOfDays = 31;
                break;
            case 9:
                nameOfMonth = "September";
                numOfDays = 30;
                break;
            case 10:
                nameOfMonth = "October";
                numOfDays = 31;
                break;
            case 11:
                nameOfMonth = "November";
                numOfDays = 30;
                break;
            case 12:
                nameOfMonth = "December";
                numOfDays = 31;


        }
        System.out.print(nameOfMonth + " " + year + " has " + numOfDays + " days\n");


    }
}
