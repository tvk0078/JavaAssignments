package com.company;

public class BankAcc {
    private String owner;
    private int balance;

    public  BankAcc(String owner){
        this.owner=owner;
    }
    public  BankAcc(String owner,int balance){
        this.balance=balance;
        this.owner=owner;
    }
    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
        }
        else{
            System.out.println("balance must be greater than 0");
        }
    }
    public void withdraw(int amount){
        if(amount>0 && amount<=balance){
                balance-=amount;
        }
        else{
            System.out.println("No sufficient balance ");
        }
    }
    public String getOwner(){
        return owner;
    }
    public int getBalance(){
        return balance;
    }
}
