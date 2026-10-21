package main.java.challenges.bank;

public class AccountRegister {

    private final int accountNumber;
    private String accountHolder;
    private double balance;

    public AccountRegister(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdrawal(double amount){
        this.balance -= amount + 5;
    }

}
