import java.util.Date;

public class Account {

    // datafield
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    // constructors
    public Account() {
    }

    public Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int newId) {
        id = newId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // monthly interest rate
    public double getMonthlyInterest() {
        return annualInterestRate / 12;
    }

    // withdraw
    public void withdraw(double withdrawAmount) {
        balance -= withdrawAmount;
    }

    // deposit
    public void deposit(double depositAmount) {
        balance += depositAmount;
    }
}
