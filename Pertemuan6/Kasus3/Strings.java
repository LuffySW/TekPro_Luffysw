package Kasus3;

import java.util.Scanner;

public class Strings {
    // --------------------------------------------
    // Reads in an array of strings, sorts them,
    // then prints them in sorted order.
    // --------------------------------------------
    public static void main(String[] args) {
        String[] stringList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many strings do you want to sort? ");
        size = scan.nextInt();
        scan.nextLine(); // Consume newline character
        stringList = new String[size];
        System.out.println("\nEnter the strings...");
        for (int i = 0; i < size; i++)
            stringList[i] = scan.nextLine();
        Sorting.selectionSort(stringList);
        System.out.println("\nYour strings in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.println(stringList[i]);
        System.out.println();
    }
}

