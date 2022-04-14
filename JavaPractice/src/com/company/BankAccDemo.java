package com.company;

public class BankAccDemo {
    public static void main(String[] args) {
        BankAcc account=new BankAcc("Vishal",5000);
        BankAcc acc1=new BankAcc("Bharath");
        acc1.deposit(10000);
        System.out.println("owner "+acc1.getOwner());
        System.out.println("Balance "+acc1.getBalance());
        System.out.println("Owner : "+account.getOwner()+" Balance : "+account.getBalance());
    }
}
