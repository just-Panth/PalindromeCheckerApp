import java.util.LinkedList;


public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";

        LinkedList<Character> list = new LinkedList<>();

        for (char c : input.toCharArray()) {
            list.addLast(c);
        }

        boolean isPalindrome = true;

        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

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
