import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter of the alphabet: ");
        String letter = input.nextLine();


        if ((letter.charAt(0) == 'a') || (letter.charAt(0) == 'e') || (letter.charAt(0) == 'i')
                || (letter.charAt(0) == 'o') || (letter.charAt(0) == 'u')) {

            System.out.println("The letter is a vowel");

        } else if ((letter.length() > 1) || (!Character.isAlphabetic(letter.charAt(0)))) {
            System.err.println("No numbers - only one letter is allowed");

        } else {
            System.out.println("The letter is a constant");
        }
    }
}
