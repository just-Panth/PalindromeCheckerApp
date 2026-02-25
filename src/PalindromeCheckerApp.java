import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "malayalam";
        PalindromeStrategy strategy = new StackStrategy();

        long startTime = System.nanoTime();
        boolean result = strategy.check(input);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Input String: " + input);
        System.out.println("Is Palindrome: " + result);
        System.out.println("Execution Time: " + duration + " nanoseconds");
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
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