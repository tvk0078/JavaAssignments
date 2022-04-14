package com.company.Assignment6;

public class ConstructorOverload {
    int a,b;
    ConstructorOverload(int a)
    {
        this(a,0);
    }
    ConstructorOverload(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void display()
    {
        System.out.println(a+" "+b);
    }
    public static void main(String args[])
    {
        ConstructorOverload obj1=new ConstructorOverload(5);
        ConstructorOverload obj2=new ConstructorOverload(14,16);
        obj1.display();
        obj2.display();
    }
}
