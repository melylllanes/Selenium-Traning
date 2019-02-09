import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Give me a number  from 0 to 1000");
        int number = input.nextInt();

        if (number >= 0 && number <= 1000) {

            int sum = 0;

            while (number > 0) {

                int add = number % 10;
                sum = sum + add;
                number = number / 10;
            }

            System.out.print("The sum of digits entered number is: " + sum);
        } else
            System.out.println("The entered number is NOT between 0 and 1000");
    }

}




