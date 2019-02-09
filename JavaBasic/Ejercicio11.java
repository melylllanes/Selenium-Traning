import java.util.Scanner;



public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" Please enter the value of the radius: ");
        double radius = input.nextDouble();


       double area = (Math.PI*radius*radius);
        double perimeter = (2*Math.PI*radius);

        System.out.println("The perimeter of the circle is: " + perimeter);
        System.out.println("The area of the circle is: " + area);
    }
}
