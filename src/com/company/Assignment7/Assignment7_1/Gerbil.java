package com.company.Assignment7.Assignment7_1;

public class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("I'm Gerbil");
    }
    @Override
    void eat() {
        System.out.println("Gerbil is eating");
    }

    @Override
    void run() {
        System.out.println("Gerbil is running");
    }
}
