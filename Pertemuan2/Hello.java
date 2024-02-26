package pertemuan2;

import java.util.Scanner;

public class Hello {
    
    // Method to calculate the sum of lengths of two strings
    public static void calculateLength(String first, String second) {
        System.out.println("Length of Strings: " + (first.length() + second.length()));
    }

    // Method to capitalize the first letter of a string
    public static String capitalize(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    // Method to join two strings with a space in between and capitalize each string
    public static void joinAndUppercase(String first, String second) {
        String capitalizedFirst = capitalize(first);
        String capitalizedSecond = capitalize(second);
        String result = capitalizedFirst + " " + capitalizedSecond;
        System.out.println("Joined and Uppercase: " + result);
    }

    // Method to perform lexicographical comparison of two strings
    public static void lexicographicalComparison(String first, String second) {
        // compareTo method returns < 0 if the first string is lexicographically first,
        // == 0 if both strings are equal, and > 0 if the second string is lexicographically first.
        int comparisonResult = first.compareTo(second);
        if (comparisonResult < 0) {
            System.out.println("Lexicographically First: Yes");
        } else if (comparisonResult == 0) {
            System.out.println("Lexicographically Equivalent");
        } else {
            System.out.println("Lexicographically First: No");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two strings
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();
        
        scanner.close();

        System.out.println("===== Result =====");
        
        // Perform string operations
        calculateLength(firstString, secondString);
        lexicographicalComparison(firstString, secondString);
        joinAndUppercase(firstString, secondString);
    }
}
