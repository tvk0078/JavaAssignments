package com.company.Assignment7.Assignment7_3;

public class ClassB extends ClassA implements InterfaceD{
    @Override
    public void methodA1() {
        System.out.println("This is methodA1");
    }

    @Override
    public void methodA2() {
        System.out.println("This is methodA2");

    }

    @Override
    public void methodB1() {
        System.out.println("This is methodB1");

    }

    @Override
    public void methodB2() {
        System.out.println("This is methodB2");

    }

    @Override
    public void methodC1() {
        System.out.println("This is methodC1");

    }

    @Override
    public void methodC2() {
        System.out.println("This is methodC2");

    }

    @Override
    public void methodD() {
        System.out.println("This is methodD");

    }
    public void method1(InterfaceA interfaceA){
        System.out.println("This is InterfaceA");
    }
    public void method2(InterfaceB interfaceB){
        System.out.println("This is InterfaceB");
    }
    public void method3(InterfaceC interfaceC){
        System.out.println("This is InterfaceC");
    }
    public void method4(InterfaceD interfaceD){
        System.out.println("This is InterfaceD");
    }
}
