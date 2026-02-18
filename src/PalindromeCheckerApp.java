
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "kayak";

        boolean result = check(input, 0, input.length() - 1);

        System.out.println("Input String: " + input);
        if (result) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }

    private static boolean check(String s, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return check(s, start + 1, end - 1);
    }
}
