import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Random;

public class RandomInputFileGenerator {
    public static void main(String[] args) {
        // Define the number of entries to generate
        int numberOfEntries = 10;

        // Define the possible values for employee names
        String[] employeeNames = {"John", "Alice", "Bob", "Emily", "David", "Sarah"};

        // Generate random entries and write them to the file
        try (PrintWriter writer = new PrintWriter(new FileWriter("inputFile.txt"))) {
            Random random = new Random();
            DecimalFormat currencyFormatter = new DecimalFormat("###,###,###,###,###"); // Format for currency

            for (int i = 0; i < numberOfEntries; i++) {
                // Generate random employee details
                String employeeType;
                if (random.nextBoolean()) {
                    employeeType = "Manager";
                } else if (random.nextBoolean()) {
                    employeeType = "Sales Associate";
                } else {
                    employeeType = "Cashier";
                }
                String employeeName = employeeNames[random.nextInt(employeeNames.length)];
                double basePay = random.nextDouble() * 1000000; // Random base pay between 0 and 1,000,000
                double numberOfHoursWorked = random.nextDouble() * 40; // Random hours worked between 0 and 40
                double hourlyRate = random.nextDouble() * 500000; // Random hourly rate between 0 and 500,000
                int numberOfTransactions = random.nextInt(100); // Random number of transactions between 0 and 100

                // Write employee details to the file
                writer.println(employeeType);
                writer.println(employeeName);
                writer.println(currencyFormatter.format(basePay));
                writer.println(numberOfHoursWorked);
                writer.println(currencyFormatter.format(hourlyRate));
                if (employeeType.equals("Manager")) {
                    double currentSales = random.nextDouble() * 1000000; // Random sales between 0 and 1,000,000
                    double currentStoreSales = random.nextDouble() * 1000000; // Random store sales between 0 and 1,000,000
                    writer.println(currencyFormatter.format(currentSales));
                    writer.println(currencyFormatter.format(currentStoreSales));
                } else if (employeeType.equals("Sales Associate")) {
                    double salesRate = random.nextDouble() * 100; // Random sales rate between 0 and 100
                    writer.println(currencyFormatter.format(salesRate));
                } else {
                    writer.println(numberOfTransactions);
                }

                // Flush the writer
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
