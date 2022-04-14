package com.company;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream ice=new IceCream("Cone",50,2);
        IceCream ice1=new IceCream("Strawberry",100,4);
        ice.addToppings("nuts");
        ice.addToppings("chocos");

        ice1.addToppings("cherry");
        ice1.addToppings("rose");

        printIce(ice);
        printIce(ice1);
    }

    public static void printIce(IceCream Icecream){
        System.out.println(Icecream.getName());
        System.out.println("Cost is rs "+Icecream.getCost());
        System.out.println("Tooped with :");
        Icecream.printToppings();
    }
}
