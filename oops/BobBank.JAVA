class BobBank {

    int accountNumber;
    int balance;
    String accountHolder;

    // Constructor
    BobBank(int accountNumber, int balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    // Deposit Method
    void deposit(int amount) {
        balance = balance + amount;
    }

    // Withdraw Method
    void withdraw(int amount) {
        balance = balance - amount;
    }

    // Check Balance
    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    // Display Details
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BobBank b1 = new BobBank(101, 2000, "Raju Bhai");

        b1.display();

        b1.deposit(500);

        b1.withdraw(300);

        b1.checkBalance();
    }
}