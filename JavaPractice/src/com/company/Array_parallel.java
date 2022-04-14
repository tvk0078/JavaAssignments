package com.company;
import java.util.*;
public class Array_parallel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String  a[]=new String[5];
        int b[]=new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextLine();
        }
        for(int i=0;i<5;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(a[i]+" is "+b[i]+" years old");
        }
    }
}
