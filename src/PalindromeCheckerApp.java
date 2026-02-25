import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "malayalam";

        PalindromeStrategy strategy = new StackStrategy();
        boolean result = strategy.check(input);

        System.out.println("Input String: " + input);
        if (result) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}