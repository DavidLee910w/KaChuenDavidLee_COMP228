package MidtermRevision.Polymorphism;

interface Payable
{
    public void pay();
}
class Employee implements Payable {
    String Name;
    double Salary;
    public Employee(String Name, double Salary){
        this.Name = Name;
        this.Salary = Salary;
    }
    public void pay(){
        System.out.println(Name + " " + Salary);
    }
}
class Contractor implements Payable {
    String Name;
    double hourlyRate;
    double workedhours;
    public Contractor(String Name, double hourlyRate, double workedhours){
        this.Name = Name;
        this.hourlyRate = hourlyRate;
        this.workedhours = workedhours;

    }
    public void pay(){
        System.out.println(Name + " " + hourlyRate*workedhours);
    }
}
class Freelancer implements Payable {
    String Name;
    double payment;
    int taskcompleted;

    public Freelancer(String Name, int taskcompleted) {
        this.Name = Name;
        this.taskcompleted = taskcompleted;
        payment = taskcompleted * 10;
    }

    public void pay(){
        System.out.println(Name + " " + payment);
    }
}
public class Q3
{
    public static void main(String[] args) {
        Employee e = new Employee("Nikhil", 10000);
        Contractor c = new Contractor("Nikhil", 17.2,39);
        Freelancer f = new Freelancer("Nikhil", 10);
        e.pay();
        c.pay();
        f.pay();
    }
}
