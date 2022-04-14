package com.company;

public class HouseDemo {
    public static void main(String[] args) {

        house myHouse = new house();
        house yourHouse = new house();

        myHouse.setStories(2);
        myHouse.setWindows(5);
        myHouse.setColor("Pink");

        System.out.println("house has stories,windows and clour as "+myHouse.getStories()+" "+myHouse.getWindows()+" "+myHouse.getColor());
    }

}
