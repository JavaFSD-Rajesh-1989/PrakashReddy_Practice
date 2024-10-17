package com.example;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 500.00);
        account.showBalance();
        account.deposit(150.00);
        account.withdraw(100.00);
        account.showBalance();
    }
}
