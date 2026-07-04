public class BankAccount {

    private int accountNumber;
    private String accountHolder;
    private double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Deposited : " + amount);
    }

    void withdraw(double amount) {

        if(amount <= balance) {

            balance = balance - amount;

            System.out.println("Withdrawn : " + amount);
        }
        else {

            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {

        System.out.println("Current Balance : " + balance);
    }

    void displayDetails() {

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(1001, "Nevil", 5000);

        b1.displayDetails();

        b1.deposit(2000);

        b1.withdraw(1500);

        b1.checkBalance();
    }
}