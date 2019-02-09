import java.util.Scanner;

public class Exercise14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What multiplication table do you want to display: ");
        int number = input.nextInt();

        for (int i = 0; i <= 12; i++) {

            System.out.println(number + " x " + i + " = " + (number * i));

        }
    }
}