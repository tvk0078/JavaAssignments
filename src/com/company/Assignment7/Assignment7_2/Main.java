package com.company.Assignment7.Assignment7_2;

public class Main {
    public static void main(String[] args) {
//                Cycle[] cycles=new Cycle[3];
//                cycles[0]=new Unicycle();
//                cycles[1]=new Bicycle();
//                cycles[2]=new Tricycle();
//
//                for(Cycle cycle: cycles)
//                    cycle.balance();
        // It throws compile time error to create abstract balance method in Cycle class

        Unicycle unicycle=new Unicycle();
        unicycle.balance();

        Bicycle bicycle=new Bicycle();
        bicycle.balance();

        Tricycle tricycle=new Tricycle();
    }
}
