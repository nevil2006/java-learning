class Bank {

    int accountNumber;
    int balance;
    String accountHolder;

    // Constructor
    Bank(int accountNumber, int balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    // Display Method
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        Bank b1 = new Bank(101, 2000, "Raju Bhai");

        b1.display();
    }
}