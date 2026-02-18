import java.util.LinkedList;


public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Define the input string
        String input = "level";

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.addLast(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {
            // removeFirst() retrieves the head, removeLast() retrieves the tail
            char first = list.removeFirst();
            char last = list.removeLast();

            // Symmetric validation: if ends don't match, it's not a palindrome
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Display the results to the console
        System.out.println("Input String: " + input);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}