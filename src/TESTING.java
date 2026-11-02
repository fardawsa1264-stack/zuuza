
import java.util.Scanner;

public class TESTING {
    public static void main(String[] args) {
        // write your code here
        Scanner inputObject = new Scanner(System.in);

        System.out.println("Enter String to Reverse: ");
        String input = inputObject.nextLine();

        reverser test = new Reverser();
        String result = test.reverse(input);

        System.out.println("Reversed String: " + result);
    }
}
