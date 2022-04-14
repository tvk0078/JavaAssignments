package com.company;

import java.util.ArrayList;

public class IceCream {
    private String name;
    private int cost;
    private int numberOfScoops;
    private ArrayList<String> toppings=new ArrayList<>();
    public IceCream(String name,int cost,int numberOfScoops ){
        this.cost=cost;
        this.name=name;
        this.numberOfScoops=numberOfScoops;
        this.toppings=new ArrayList<>();
    }
    public void addToppings(String topping){
            toppings.add(topping);
    }
    public int getCost()
    {
        return cost;
    }
    public  String getName(){
        return name;
    }
    public  int getNumScoops(){
        return numberOfScoops;
    }
    public void printToppings(){
        for(String topping: toppings){
            System.out.println("\t"+topping);
        }
    }
}
