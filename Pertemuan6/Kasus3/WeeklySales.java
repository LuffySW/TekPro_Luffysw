package Kasus3;
import java.util.Scanner;
public class WeeklySales {
    public static void main(String[] args) {
        SalesPerson[] salesStaff = readSalesStaff();
        Sorting.insertionSort(salesStaff);
        System.out.println("\nRanking of Sales for the Week\n");
        for (SalesPerson s : salesStaff)
            System.out.println(s);
    }

    public static SalesPerson[] readSalesStaff() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of salespeople: ");
        int numSalespeople = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        SalesPerson[] salesStaff = new SalesPerson[numSalespeople];
        for (int i = 0; i < numSalespeople; i++) {
            System.out.println("Enter details for salesperson " + (i + 1) + ":");
            System.out.print("First name: ");
            String firstName = scanner.nextLine();
            System.out.print("Last name: ");
            String lastName = scanner.nextLine();
            System.out.print("Sales amount: ");
            double salesAmount = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            salesStaff[i] = new SalesPerson(firstName, lastName, salesAmount);
        }

        scanner.close();
        return salesStaff;
    }
}


