
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "kayak";

        // Start the recursive check from the first and last indices
        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Input String: " + input);
        if (result) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }

    /**
     * Recursively checks whether a string is a palindrome.
     * * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base Case: If pointers meet or cross, all checks passed
        if (start >= end) {
            return true;
        }

        // Check if characters at current positions match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call: move inward by incrementing start and decrementing end
        return check(s, start + 1, end - 1);
    }
}