import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreDriver {

    public static void main(String[] args) throws FileNotFoundException {
        int managerCount = 0;
        int salesAssociateCount = 0;
        int cashierCount = 0;

        PrintWriter pwd = new PrintWriter(new File("outputFile.txt"));
        Scanner sc = new Scanner(new File("inputFile.txt"));
        List<Manager> managerList = new ArrayList<>();
        List<SalesAssociate> salesAssociateList = new ArrayList<>();
        List<Cashier> cashierList = new ArrayList<>();

        while (sc.hasNextLine()) {
            String employeeType = sc.nextLine();
            String empName = sc.nextLine();
            double basePay = parseCurrency(sc.nextLine());
            double numberOfHoursWorked = Double.parseDouble(sc.nextLine());
            double hourlyRate = parseCurrency(sc.nextLine());

            if (employeeType.equals("Manager")) {
                double currentSales = parseCurrency(sc.nextLine());
                double currentStoreSales = parseCurrency(sc.nextLine());
                Manager manager = new Manager(currentStoreSales, currentSales, numberOfHoursWorked,
                        hourlyRate, "", basePay, empName);
                managerList.add(manager);
            } else if (employeeType.equals("Sales Associate")) {
                double salesRate = parseCurrency(sc.nextLine());
                SalesAssociate salesAssociate = new SalesAssociate(salesRate, numberOfHoursWorked, hourlyRate, "", empName, basePay);
                salesAssociateList.add(salesAssociate);
            } else if (employeeType.equals("Cashier")) {
                int numberOfTransactions = Integer.parseInt(sc.nextLine());
                Cashier cashier = new Cashier(numberOfHoursWorked, hourlyRate, "", basePay, empName);
                cashier.setNumberOfTransactions(numberOfTransactions);
                cashierList.add(cashier);
            }
        }

        System.out.println("******************************************************");
        System.out.println("Number of employees working as MANAGER are: " + managerList.size());
        System.out.println("******************************************************");
        pwd.println("******************************************************");
        pwd.println("Number of employees working as MANAGER are: " + managerList.size());
        pwd.println("******************************************************");

        for (Manager manager : managerList) {
            managerCount++;
            System.out.println(managerCount + ". Manager Details:");
            System.out.println(manager);
            pwd.println(managerCount + ". Manager Details:");
            pwd.println(manager);
            System.out.println("Percentage of sales done: " + String.format("%.2f", manager.salesPercentByManager()) + "%");
            pwd.println("Percentage of sales done: " + String.format("%.2f", manager.salesPercentByManager()) + "%");
            System.out.println("Gross Payment: $" + String.format("%.1f", manager.calculatePay()));
            pwd.println("Gross Payment: $" + String.format("%.1f", manager.calculatePay()));
            System.out.println("Remaining store revenue: $" + manager.calculateRemainingStoreRevenue(manager.getTotalStoreSales()));
            pwd.println("Remaining store revenue: $" + manager.calculateRemainingStoreRevenue(manager.getTotalStoreSales()));

            System.out.print("Is " + manager.getEmployeeName() + " eligible for promotion? ");
            if (manager.checkPromotionEligibility()) {
                System.out.println("Yes, he/she is eligible\n");
            } else {
                System.out.println("No, he/she needs to work harder\n");
            }
            manager.determineLeave();
        }

        System.out.println("******************************************************");
        System.out.println("Number of employees working as SALES ASSOCIATES are: " + salesAssociateList.size());
        System.out.println("******************************************************");
        pwd.println("******************************************************");
        pwd.println("Number of employees working as SALES ASSOCIATES are: " + salesAssociateList.size());
        pwd.println("******************************************************");

        for (SalesAssociate salesAssociate : salesAssociateList) {
            salesAssociateCount++;
            System.out.println(salesAssociateCount + ". Sales Associate Details:");
            System.out.println(salesAssociate);
            pwd.println(salesAssociate);
            System.out.println("Total commission: $" + salesAssociate.calculateCommission());
            System.out.println("Gross Payment: $" + salesAssociate.calculatePay());
            pwd.println("Total commission: $" + salesAssociate.calculateCommission());
            pwd.println("Gross Payment: $" + salesAssociate.calculatePay());
            System.out.print("Is " + salesAssociate.getEmployeeName() + " eligible for promotion? ");
            if (salesAssociate.checkPromotionEligibility()) {
                System.out.println("Yes, he/she is eligible\n");
            } else {
                System.out.println("No, he/she needs to work harder\n");
            }
            salesAssociate.determineLeave();
        }

        System.out.println("******************************************************");
        System.out.println("Number of employees working as CASHIER are: " + cashierList.size());
        System.out.println("******************************************************");
        pwd.println("******************************************************");
        pwd.println("Number of employees working as CASHIER are: " + cashierList.size());
        pwd.println("******************************************************");

        for (Cashier cashier : cashierList) {
            cashierCount++;
            System.out.println(cashierCount + ". Cashier Details:");
            System.out.println(cashier);
            pwd.println(cashierCount + ". Cashier Details:");
            pwd.println(cashier);
            System.out.println("Number of Transactions: " + cashier.getNumberOfTransactions());
            pwd.println("Number of Transactions: " + cashier.getNumberOfTransactions());
            System.out.println("Total commission: $" + cashier.calculateCommission());
            System.out.println("Gross Payment: $" + cashier.calculatePay());
            pwd.println("Total commission: $" + cashier.calculateCommission());
            pwd.println("Gross Payment: $" + cashier.calculatePay());
            System.out.print("Is " + cashier.getEmployeeName() + " eligible for promotion? ");
            if (cashier.checkPromotionEligibility()) {
                System.out.println("Yes, he/she is eligible\n");
            } else {
                System.out.println("No, he/she needs to work harder\n");
            }
            cashier.determineLeave();
        }

        pwd.close();
    }
    private static double parseCurrency(String currency) {
        // Hapus tanda koma dan ubah menjadi double
        return Double.parseDouble(currency.replace(",", ""));
    }
}
