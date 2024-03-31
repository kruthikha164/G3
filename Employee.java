// Employee.java
public class Employee {
    private String name;
    private int employeeId;
    protected double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Creating an employee
        Employee employee = new Employee("kruthikha", 12345, 50000);
        System.out.println("Employee Details:");
        employee.displayDetails();
        
        // Creating a DevOps Engineer
        DevOpsEngineer devOpsEngineer = new DevOpsEngineer("kanishkka", 54321, 60000, 10000);
        System.out.println("\nDevOps Engineer Details:");
        devOpsEngineer.displayDetails();
    }
}

 
