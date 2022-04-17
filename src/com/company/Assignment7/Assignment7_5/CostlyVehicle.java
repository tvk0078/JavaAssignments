package com.company.Assignment7.Assignment7_5;

public class CostlyVehicle {
    public static class Bullet extends Vehicle.Bike
    {
        Bullet(int number_of_wheels)
        {
            super(number_of_wheels+number_of_wheels);
            System.out.println(number_of_wheels);
        }
    }
    public static void main(String args[])
    {
        Vehicle.Bike vehicle =new Vehicle.Bike(15);

        CostlyVehicle.Bullet  costlyVehicle = new CostlyVehicle.Bullet(22);


    }
}
