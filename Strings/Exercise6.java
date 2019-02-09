public class Exercise6 {


    public static void main(String[] args) {

        String str1 = "example.com";
        String str2 = "Example.com ";

        System.out.println("Comparing " + str1 + " to: " + str1 + (str1.equals(str1)));
        System.out.println("Comparing " + str2 + " to: " + str1 + (str2.equals(str1)));
    }
}
