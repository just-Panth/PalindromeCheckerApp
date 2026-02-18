
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // The original input string with mixed casing and spaces
        String input = "A man a plan a canal Panama";

        // Step 1: Normalization
        // replaceAll("[^a-zA-Z0-String]", "") removes all non-alphanumeric characters
        // toLowerCase() ensures case-insensitivity
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        // Step 2: Compare characters from both ends
        // Loop only till half of the normalized string length
        for (int i = 0; i < normalized.length() / 2; i++) {

            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Step 3: Display results
        System.out.println("Original: " + input);
        System.out.println("Normalized: " + normalized);
        if (isPalindrome) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}