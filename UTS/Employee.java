public class Employee {
    private String name;
    private String address;
    private String phoneNumber;
    private double baseSalary; // Base salary for all employees
    private String position; // Position of the employee

    public Employee(String name, String address, String phoneNumbers,String position) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.baseSalary = determineBaseSalary(position); // Determine base salary based on position
    }

    private double determineBaseSalary(String position) {
        switch (position.toLowerCase()) {
            case "staf manager":
                return 5000000;
            case "staf programmer":
            case "staf analis":
                return 3000000;
            default:
                return 0; // Invalid position, return 0
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    // Method to get position
    public String getPosition() {
        return position;
    }

    
}