package com.company.Assignment7.Assignment7_1;

public class Mouse extends Rodent{
    Mouse(){
        System.out.println("I'm Mouse");
    }
    @Override
    void eat() {
        System.out.println("Mouse is eating");
    }

    @Override
    void run() {
        System.out.println("Mouse is running");
    }
}
