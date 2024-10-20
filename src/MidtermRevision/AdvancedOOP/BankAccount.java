package MidtermRevision.AdvancedOOP;
import java.util.Scanner;

    public class BankAccount {
        String AccountHolder;
        double Balance;
        final String Account_Number;

        public void Deposit(double amount) {
            Balance += amount;
            System.out.println("Amount Deposited: " + amount);
            DisplayBalance();
        }
        public BankAccount(String Account_Number, String AccountHolder, double Balance) {
            this.Account_Number = Account_Number;
            this.AccountHolder = AccountHolder;
            this.Balance = Balance;
        }
        public void Withdraw(double amount) {
            if (amount > Balance) {
                System.out.println("Insufficient Funds");
                return;
            }
            else if (amount < 0) {
                System.out.println("Invalid Amount");
            }
            else {
                Balance -= amount;
                System.out.println("Amount Withdrawn: " + amount);
            }
        }
        public void DisplayBalance() {
            System.out.println("Current Balance: " + Balance);
        }



    public static void main(String[] args) {
        BankAccount account = new BankAccount("100123456","John Doe", 0);

        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Enter 'deposit' or 'withdraw': ");
            String action = scanner.nextLine();
            if (action.equals("deposit")) {
                System.out.print("Enter amount to deposit:");
                double amount = scanner.nextDouble();
                account.Deposit(amount);
            } else if (action.equals("withdraw")) {
                System.out.print("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();
                account.Withdraw(amount);
            }
            scanner.nextLine(); // Consume newline
            System.out.print("Do you want to continue (yes/no)? ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));
        scanner.close();
    }

}
