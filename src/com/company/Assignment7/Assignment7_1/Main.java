package com.company.Assignment7.Assignment7_1;

public class Main {
    public static void main(String[] args) {
        Rodent[] r=new Rodent[3];
        r[0]=new Mouse();
        r[1]=new Gerbil();
        r[2]=new Hamster();

        for(int i=0;i<3;i++){
            r[i].eat();
            r[i].run();
        }
    }
}
