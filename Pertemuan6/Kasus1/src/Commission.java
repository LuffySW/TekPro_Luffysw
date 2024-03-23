public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String name, String address, String phoneNumber, String socialSecurityNumber, double hourlyPayRate, double commissionRate) {
        super(name, address, phoneNumber, socialSecurityNumber, hourlyPayRate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    public double pay() {
        double payment = super.pay() + (totalSales * commissionRate);
        totalSales = 0;
        return payment;
    }

    public String toString() {
        return super.toString() + "\nTotal Sales: $" + totalSales;
    }
}