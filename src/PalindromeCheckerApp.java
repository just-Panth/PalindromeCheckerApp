public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "deified";
        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        System.out.println("Input String: " + input);
        if (result) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}

class PalindromeService {

    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}