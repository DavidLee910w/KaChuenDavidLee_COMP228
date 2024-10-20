package Lab3;
import java.util.Scanner;

abstract class Insurance {
    public String typeOfInsurance;
    public double monthlyPremium;

    // get method
    public String getTypeOfInsurance() {
        return typeOfInsurance;
    }

    public double getMonthlyPremium() {
        return monthlyPremium;
    }

    // set Insurance Cost
    public void setInsuranceCost(double insuranceCost) {
        monthlyPremium = insuranceCost;
    }

    public String displayInfo() {
        return "Type of Insurance: " + this.typeOfInsurance + "\nMonthly Premium: " + this.monthlyPremium;
    }
}

class LifeInsurance extends Insurance {
    public LifeInsurance() {
        this.typeOfInsurance = "Life Insurance";
    }

    @Override
    public void setInsuranceCost(double insuranceCost) {
        super.setInsuranceCost(insuranceCost);
    }
}

class HealthInsurance extends Insurance {
    public HealthInsurance() {
        this.typeOfInsurance = "Health Insurance";
    }

    @Override
    public void setInsuranceCost(double insuranceCost) {
        super.setInsuranceCost(insuranceCost);
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        // user input for type of insurance
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type of insurance: ");
        String type = scanner.nextLine();
        System.out.println("Enter monthly premium: ");
        double premium = scanner.nextDouble();
        // polymorphic way
        Insurance insurance = null;
        if (type.equalsIgnoreCase("Life")) {
            insurance = new LifeInsurance();
        } else if (type.equalsIgnoreCase("Health")) {
            insurance = new HealthInsurance();
        }
        // set monthly premium
        insurance.setInsuranceCost(premium);
        System.out.println(insurance.displayInfo());
        scanner.close();
    }
}