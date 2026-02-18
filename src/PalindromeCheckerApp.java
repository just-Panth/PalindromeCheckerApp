import java.util.Stack;


public class PalindromeCheckerApp {


    public static void main(String[] args) {
        // Declare and initialize the input string.
        String input = "noon";

        // Create a Stack to store characters.
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Iterate again through the original string.
        for (char c : input.toCharArray()) {
            // Pop the top character from the stack.
            // Due to LIFO, the first pop gives the last character of the original string.
            char poppedChar = stack.pop();

            // Compare original character with popped character
            if (c != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Display the result
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}
