import java.util.Scanner;
public class u3app {
// Required to read user input
        public static void main(String[] args) {
            // 1. Initialize Scanner for User Input
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a word to check: ");
            // 2. Read the string from the user
            String original = scanner.nextLine();
            String reversed = "";

            // 3. Key Concept: Loop (for loop) for Reversal
            for (int i = original.length() - 1; i >= 0; i--) {
                // Key Concept: String Concatenation (+)
                // Creates a new String object in memory every time!
                reversed = reversed + original.charAt(i);
            }

            // 4. Key Concept: equals() Method
            // Compares content ("madam" vs "madam") rather than memory address
            if (original.equalsIgnoreCase(reversed)) {
                System.out.println("Success: '" + original + "' is a palindrome.");
            } else {
                System.out.println("Result: '" + original + "' is NOT a palindrome.");
            }

            // Close the scanner to free up resources
            scanner.close();
        }
    }
