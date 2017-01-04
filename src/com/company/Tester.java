package com.company;

public class Tester {

    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount(200, 5);
        myAccount.deposit(132.14);
        myAccount.addInterest();

        System.out.println("Hello my friendos");
        System.out.println("Final balance is: " + myAccount.getBalance());

        /*
        Superclass - the "original" class.
        Subclass - the class that extends from the superclass.

        Abstract classes cannot have objects instantiated from it.
        Final classes cannot have their code inherited from it.

        Methods in subclasses can override methods in superclasses.
        Final methods cannot be overriden.
        */
    }
}
