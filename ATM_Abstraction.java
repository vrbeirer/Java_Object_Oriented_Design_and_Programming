import java.util.Scanner;

abstract class ATM {
    double balance;

    ATM(double balance) {
        this.balance = balance;
    }

    abstract void withdraw(double amount);
    abstract void deposit(double amount);
    abstract void checkbal();
}

class SBI extends ATM {
    SBI(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(" Withdrawal successful. Available balance: ₹" + balance);
        } else {
            System.out.println(" Insufficient balance or invalid amount.");
        }
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" Amount deposited successfully. New balance: ₹" + balance);
        } else {
            System.out.println(" Invalid amount.");
        }
    }

    @Override
    void checkbal() {
        System.out.println(" Current balance: ₹" + balance);
    }
}

public class ATM_Abstraction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SBI obj = new SBI(1000); // Initial balance ₹1000

        while (true) {
            System.out.println("\n----------- ATM MENU ---------------");
            System.out.println("\n");
            System.out.println("Available Balance"+obj.balance);
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("-----------------------------------");
            System.out.print("Enter your choice: ");

            int choice = s.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount to withdraw: ₹");
                    double amount = s.nextDouble();
                    obj.withdraw(amount);
                }
                case 2 -> {
                    System.out.print("Enter amount to deposit: ₹");
                    double amount = s.nextDouble();
                    obj.deposit(amount);
                }
                case 3 -> obj.checkbal();
                case 4 -> {
                    System.out.println(" Thank you for using the ATM! Have a great day.");
                    return;
                }
                default -> System.out.println(" Invalid choice! Please try again.");
            }
        }
    }
}
