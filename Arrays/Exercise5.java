import java.util.Scanner;
import java.util.Arrays;


public class Exercise5 {


    public static boolean findName (String[] listOfNames,String  word) {
        for(String s: listOfNames){
            if(s.equalsIgnoreCase(word))
                return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String[] listOfNames = {" Melissa", "Candy", "Dariana", "Gloria"};

        System.out.println("What name do you want to search for? ");
        String word = input.nextLine();
        System.out.println(findName(listOfNames, word));





    }
}
