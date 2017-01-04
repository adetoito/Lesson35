package com.company;

public class SavingsAccount extends BankAccount {

    // Implements all BankAccount methods.
    // This is because this extends from the BankAccount class.

    public SavingsAccount (double amt, double rate) {
        super(amt); // Amount is thrown to BankAccount.
        interestRate = rate;
    }

    public void addInterest () {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
    }

    private double interestRate;

}
