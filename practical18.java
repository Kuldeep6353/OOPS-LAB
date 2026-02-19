class BankAccount {

    // Instance variables
    String accountHolderName;
    double balance;

    // Static variable (same for all accounts)
    static double interestRate;

    // Static block to initialize interest rate
    static {
        interestRate = 5.0;   // 5% default interest
        System.out.println("Static Block: Default Interest Rate Set to 5%");
    }

    // Constructor
    BankAccount(String name, double bal) {
        accountHolderName = name;
        balance = bal;
        System.out.println("Account Created for: " + name);
    }

    // Method to calculate interest
    double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    // Method to display interest
    void displayInterest() {
        System.out.println("Interest for " + accountHolderName + " = " + calculateInterest());
    }

    // Static method to update interest rate
    static void updateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Interest Rate Updated to: " + interestRate + "%");
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("bapa sitaram", 10000);
        BankAccount acc2 = new BankAccount("kuldip ahir", 20000);

        BankAccount acc3 = new BankAccount("shaaaaad malik", 25000);

        acc1.displayInterest();
        acc2.displayInterest();

        // Updating interest rate
        BankAccount.updateInterestRate(7.0);

        acc1.displayInterest();
        acc2.displayInterest();
    }
}
