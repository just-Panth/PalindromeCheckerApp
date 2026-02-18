public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "madam";
        String reversed = "";

        System.out.println("Original String: " + input);

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}