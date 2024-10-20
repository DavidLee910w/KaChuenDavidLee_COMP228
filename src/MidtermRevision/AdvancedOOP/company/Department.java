package MidtermRevision.AdvancedOOP.company;

public class Department {
    String departmentName;
    Employee employee; // Changed to singular for clarity

    // Constructor
    public Department(String departmentName, Employee employee) {
        this.departmentName = departmentName;
        this.employee = employee;
    }

    public void getDepartmentInfo() {
        System.out.println("Department: " + departmentName + "\n");
        employee.getEmployeeInfo(); // Call the method directly
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 12345);
        Department dept = new Department("IT", emp);
        dept.getDepartmentInfo();
    }
}