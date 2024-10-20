package Lab3;
import java.util.Scanner;

abstract class GameTester{
    public String name;
    public boolean fullTimeStatus;
    public void setName(String name){
        this.name = name;
    }
    public void setFullTimeStatus(boolean fullTimeStatus){
        this.fullTimeStatus = fullTimeStatus;
    }
    public double salary;
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String displayInfo() {
        String status = fullTimeStatus ? "Full Time" : "Part Time";
        return "Name: " + name + ", Status: " + status + ", Salary: " + salary;
    }
}
class FullTimeGameTester extends GameTester{
    public FullTimeGameTester(String name, boolean fullTimeStatus){
        this.name = name;
        this.fullTimeStatus = fullTimeStatus;
        this.salary=3000;
    }
}
class PartTimeGameTester extends GameTester{
    public PartTimeGameTester(String name, boolean fullTimeStatus, double workedHours){
        this.name = name;
        this.fullTimeStatus = fullTimeStatus;
        setSalary(workedHours);
    }
    public void setSalary(double workedHours){
        this.salary = 20*workedHours;
    }
}
public class Exercise2 {
    public static void main(String[] args) {
        //user input on type of game tester
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type of game tester (FullTime or PartTime): ");
        String type = scanner.nextLine();
        System.out.println("Enter the name of game tester: ");
        String name = scanner.nextLine();
        // polymorphic way
        GameTester gameTester = null;
        if (type.equalsIgnoreCase("FullTime")){
            gameTester = new FullTimeGameTester("FullTime", true);
        } else if (type.equalsIgnoreCase("PartTime")){
            System.out.println("Enter worked hours: ");
            double workedHours = scanner.nextDouble();
            gameTester = new PartTimeGameTester("PartTime", false, workedHours);
        }
        scanner.close();
        System.out.println(gameTester.displayInfo());


    }

}
