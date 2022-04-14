package com.company;


import java.util.ArrayList;

public class SumOfEle {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(4);
        al.add(8);
        al.add(2);

        int sum=sumElements(al);
        System.out.println(sum);
    }

    public static int sumElements(ArrayList<Integer> al){
        int s=0;
        for(int i=0;i<al.size();i++){
            s+=al.get(i);
        }
        return s;
    }
}
