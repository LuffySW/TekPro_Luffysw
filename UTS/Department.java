import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentName;
    private List<Employee> employees; // List of employees in the department

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to remove an employee from the department
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    // Method to get the department name
    public String departmentName() {
        return departmentName;
    }
}
