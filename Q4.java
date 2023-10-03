import java.util.*;

class Account {
    private static int nextAccountNumber = 1;
    private String customerName;
    private int accountNumber;
    private String accountType;
    protected double balance;

    public Account(String customerName, String accountType) {
        this.customerName = customerName;
        this.accountNumber = nextAccountNumber++;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    public void displayBalance() {
        System.out.println("Account Balance: $" + balance);
    }

    public void computeInterest() {
        // Implement interest calculation for savings account (if needed)
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

class CurrentAccount extends Account {
    private double minimumBalance;
    private double serviceCharge;

    public CurrentAccount(String customerName, double minimumBalance) {
        super(customerName, "Current");
        this.minimumBalance = minimumBalance;
        this.serviceCharge = 0.0;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
            imposePenalty();
        }
    }

    private void imposePenalty() {
        serviceCharge += 10.0; // Example penalty amount
        balance -= serviceCharge;
        System.out.println("Penalty of $" + serviceCharge + " imposed.");
    }

    public void checkMinimumBalance() {
        if (balance < minimumBalance) {
            System.out.println("Account balance is below minimum. Service charge may apply.");
        }
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String customerName) {
        super(customerName, "Savings");
    }

    @Override
    public void computeInterest() {
        // Implement interest calculation for savings account
        // Example: balance *= (1 + 0.05); // 5% interest rate
    }
}

public class Main {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount("John Doe", 1000.0);
        SavingsAccount savingsAccount = new SavingsAccount("Alice Smith");

        currentAccount.deposit(1500.0);
        currentAccount.displayBalance();
        currentAccount.withdraw(800.0);
        currentAccount.checkMinimumBalance();

        savingsAccount.deposit(2000.0);
        savingsAccount.displayBalance();
        savingsAccount.computeInterest();
        savingsAccount.displayBalance();
    }
}
