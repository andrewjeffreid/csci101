public class TestAccount {
    public static void main(String[] args) {
        
        // create Account object with ID, balance, and annual interest rate
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);

        // print balance, monthly interest rate, and data created
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Monthly Interest Rate: " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
    }
}
