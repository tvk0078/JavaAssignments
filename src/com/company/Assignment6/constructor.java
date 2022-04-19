package com.company.Assignment6;

public class constructor {
    constructor(String  str)
    {

        System.out.println(str);
    }

    constructor[] arr;
    public static void main(String args[])
    {
        constructor obj=new constructor("Vishal");
        obj.arr=new constructor[2];
        obj.arr[0]=new constructor("Vishal");
        obj.arr[1]=new constructor("Tella");
    }
}
