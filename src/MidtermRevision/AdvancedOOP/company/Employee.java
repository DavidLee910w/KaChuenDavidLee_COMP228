package MidtermRevision.AdvancedOOP.company;

public class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void getEmployeeInfo() {
        System.out.println("Name: " + name + "\nID: " + id);
    }
}