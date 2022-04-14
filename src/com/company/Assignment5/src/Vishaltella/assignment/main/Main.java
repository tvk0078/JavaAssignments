package Vishaltella.assignment.main;

import Vishaltella.assignment.data.data;
import Vishaltella.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        data defaultInit = new data();
        defaultInit.printInformation();
        defaultInit.printLocalInformation();
        //compilation error because local variables are not initialized


        Singleton singletonDemo = new Singleton("Vishal");
        singletonDemo.print();
        //compilation error because non-static variable str cannot be referenced from a static context
    }
}
