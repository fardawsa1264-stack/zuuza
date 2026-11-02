import java.util.Stack;
public class abc {
    public class Main {
        public static void main(String[] args) {

            String input = "ABCDE";

            Stack<Character> stack = new Stack<Character>();

            for (char ch : input.toCharArray()) {
                stack.push(ch);
            }

            String output = "";

            while (!stack.isEmpty()) {
                output = output + stack.pop();
            }

            System.out.println("Input: " + input);
            System.out.println("Output: " + output);
        }
    }
}