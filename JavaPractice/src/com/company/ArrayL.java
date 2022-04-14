package com.company;
import java.util.*;

public class ArrayL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList();
        int a=sc.nextInt();
        while(a>0){
            al.add(a);
            a=sc.nextInt();
        }
        for(int i=al.size()-1;i>=0;i--){
            System.out.println(al.get(i));
        }
    }
}
