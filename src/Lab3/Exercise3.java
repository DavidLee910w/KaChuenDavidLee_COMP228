package Lab3;
import java.util.Scanner;

abstract class Mortgage implements MortgageConstants{
    public int mortgageNumber;
    public String customerName;
    public double mortgageAmount;
    public double interestRate;
    public int mortgageTerm;
    //force mortgage amount < 300000, force mortgage term undefined to 1 year
    public Mortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int mortgageTerm){
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        this.mortgageAmount = mortgageAmount;
        if (mortgageAmount > maximumMortgageAmount) {
            this.mortgageAmount = maximumMortgageAmount;
            System.out.println("Mortgage amount cannot exceed $300,000. Setting to the upper cap of $300,000");
        }
        this.interestRate = interestRate;
        if (mortgageTerm != shortTerm && mortgageTerm != mediumTerm && mortgageTerm != longTerm) {
            this.mortgageTerm = shortTerm;
        } else {
            this.mortgageTerm = mortgageTerm;
        }
    }
    public String getMortgageInfo() {
        return  "Bank Name: " + BankName
                + "\nMortgage Number: " + this.mortgageNumber
                + "\nCustomer Name: " + this.customerName
                + "\nMortgage Amount: " + this.mortgageAmount
                + "\nInterest Rate: " + this.interestRate
                + "\nMortgage Term: " + this.mortgageTerm + " year"
                + "\nTotal Owed: " + getTotalOwed();
    }
    public double getTotalOwed() {
        return mortgageAmount + (mortgageAmount * (interestRate / 100.0) * mortgageTerm);
    }
}
interface MortgageConstants{
    final int shortTerm = 1;
    final int mediumTerm = 3;
    final int longTerm = 5;
    final double maximumMortgageAmount = 300000;
    final String BankName = "CityToronto Bank";

}

class BusinessMortgage extends Mortgage{
    public BusinessMortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int mortgageTerm){
        super(mortgageNumber, customerName, mortgageAmount,interestRate+1, mortgageTerm);
    }
}
class PersonalMortgage extends Mortgage{
    public PersonalMortgage(int mortgageNumber, String customerName, double mortgageAmount, double interestRate, int mortgageTerm){
        super(mortgageNumber, customerName, mortgageAmount,interestRate+2, mortgageTerm);
    }
}
public class Exercise3 {
    public static void main(String[] args) {
        //create an array of 3 mortgage objects
        Mortgage[] mortgages = new Mortgage[3];
        Scanner scanner = new Scanner(System.in);
        //loop for user input on details
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter current prime rate: ");
            double currentPrimeRate = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter mortgage type (Business or Personal): ");
            String mortgageType = scanner.nextLine();
            System.out.print("Enter mortgage number: ");
            int mortgageNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();
            System.out.print("Enter mortgage amount: ");
            double mortgageAmount = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter mortgage term in years (1,3,5yrs): ");
            int mortgageTerm = scanner.nextInt();
            scanner.nextLine();
            if (mortgageType.equalsIgnoreCase("Business")) {
                mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, mortgageAmount, currentPrimeRate, mortgageTerm);
            } else if (mortgageType.equalsIgnoreCase("Personal")) {
                mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, mortgageAmount, currentPrimeRate, mortgageTerm);
            }else {
                System.out.println("Invalid mortgage type");
                i--;
            }
        }
        System.out.println(("\nMortgage Details:\n"));
        for (int i = 0; i < 3; i++) {
            System.out.println("Mortgage Type: "+mortgages[i].getClass().getSimpleName()+"\n"+mortgages[i].getMortgageInfo()+"\n");
        }
    }
}



