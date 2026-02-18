import java.util.ArrayDeque;
import java.util.Deque;


public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Define the input string
        String input = "refer"; //

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>(); //

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c); //
        }

        boolean isPalindrome = true; //

        while (deque.size() > 1) { 
            char front = deque.removeFirst(); //
            char back = deque.removeLast();   //

            if (front != back) {
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
