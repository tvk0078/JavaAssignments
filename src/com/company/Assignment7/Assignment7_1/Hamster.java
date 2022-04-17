package com.company.Assignment7.Assignment7_1;

public class Hamster extends Rodent{
    Hamster(){
        System.out.println("I'm Hamster");
    }
    @Override
    void eat() {
        System.out.println("Hamster is eating");
    }

    @Override
    void run() {
        System.out.println("Hamster is Running");
    }
}
