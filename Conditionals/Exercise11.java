import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {


        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Input number : " + num);
        System.out.println("The first n natural numbers are: ");

        for (int i = 1; i <= num; i++) {

            System.out.println(i);
            sum += i;
        }
        System.out.println("The Sum of Natural Number up to n terms:  " + sum);

    }

}
