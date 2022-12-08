package com.yemeksepeti.classexample;

public class TestBankAccount {
    public static void main(String[] args) {

        // construct new class
//        long accountNumber, double balance, String customerName, String email, String phoneNumber
        BankAccount bankAccount = new BankAccount(1L, 1, "aa", "aa", "5555555");
        System.out.println("Current balance : " + bankAccount.getBalance());
        bankAccount.depositBalance(10.50);
        System.out.println("After deposit balance : " + bankAccount.getBalance());
        bankAccount.withdrawBalance(15.50);
        System.out.println("After withdraw balance : " + bankAccount.getBalance());
    }
}
