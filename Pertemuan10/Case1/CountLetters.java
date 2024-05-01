package Case1;
import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        try {
            // Get word from user
            System.out.print("Enter a single word (letters only, please): ");
            String word = scan.nextLine();

            // Convert to all upper case
            word = word.toUpperCase();

            // Count frequency of each letter in string
            for (int i = 0; i < word.length(); i++)
                counts[word.charAt(i) - 'A']++;

            // Print frequencies
            System.out.println();
            for (int i = 0; i < counts.length; i++)
                if (counts[i] != 0)
                    System.out.println((char) (i + 'A') + ": " + counts[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            char invalidChar = findInvalidCharacter(e.getMessage());
            System.out.println("Not a letter: " + invalidChar);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scan.close();
        }
    }
    
    private static char findInvalidCharacter(String message) {
        for (char c : message.toCharArray()) {
            if (!Character.isLetter(c)) {
                return c;
            }
        }
        return '?'; // Default if no invalid character found
    }
}
