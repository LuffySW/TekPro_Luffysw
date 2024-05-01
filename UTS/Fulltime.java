public class Fulltime extends Employee implements Koperasi {
    private int overtimeHours; // Total overtime hours
    private int numberOfChildren; // Number of children
    private double loanAmount; // Cooperative loan amount

    public Fulltime(String name, String address, String phoneNumber, String position) {
        super(name, address, phoneNumber, position); // Position determines the base salary
        this.overtimeHours = 0;
        this.numberOfChildren = 0;
        this.loanAmount = 0; // Default loan amount is zero
    }

    // Method to set overtime hours
    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    // Method to set number of children
    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    // Method to set loan amount
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // Method to get loan amount
    public double getLoanAmount() {
        return loanAmount;
    }

    // Method to calculate total salary
    @Override
    public double getBaseSalary() {
        double salary = super.getBaseSalary() // Base salary
                + calculatePositionAllowance() // Position allowance
                + calculateCommunicationAllowance() // Communication allowance
                + calculateOvertimeAllowance() // Overtime allowance
                + calculateChildAllowance() // Child allowance
                - loanAmount; // Deduct cooperative loan

        return salary;
    }

    // Method to calculate position allowance
    double calculatePositionAllowance() {
        switch (getPosition().toLowerCase()) {
            case "staf manager":
                return 5000000; // Position allowance for manager
            case "staf programmer":
                return 2000000; // Position allowance for programmer
            case "staf analis":
                return 3000000; // Position allowance for analyst
            default:
                return 0; // Invalid position, no position allowance
        }
    }

    // Method to calculate communication allowance
    public double calculateCommunicationAllowance() {
        return 500000; // Communication allowance for all positions
    }

    // Method to calculate overtime allowance
    public double calculateOvertimeAllowance() {
        // Overtime allowance for Saturday and Sunday
        double overtimeRate = 30000; // Rate per hour
        double overtimeAllowance = 0;
        if (overtimeHours > 0) {
            overtimeAllowance = overtimeHours * overtimeRate;
        }
        return overtimeAllowance;
    }

    // Method to calculate child allowance
    public double calculateChildAllowance() {
        // Maximum 2 children allowance with 500000 per child
        int maxChildren = 2;
        double childAllowancePerChild = 500000;
        return Math.min(numberOfChildren, maxChildren) * childAllowancePerChild;
    }

    // Implement method from Koperasi interface
    @Override
    public double loanMonthly(double loanAmount) {
        // Set the loan amount
        setLoanAmount(loanAmount);
        // Return the loan amount given
        return loanAmount;
    }
}
