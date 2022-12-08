package com.yemeksepeti.classexample;

public class BankAccount {
    // instance variables
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // constuctors
    public BankAccount() {
    }

    public BankAccount(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // custom methods
    public double depositBalance(double balance) {
        this.balance += balance;
        return balance;
    }

    public double withdrawBalance(double balance) {
        if (this.balance > balance) {
            this.balance -= balance;
        } else {
            System.out.println("Insufficent balance...");
        }
        return balance;
    }

    // getters & setters
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
