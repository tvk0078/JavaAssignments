package com.company;

import java.util.Scanner;

public class project_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Average of 3 num is "+ (a+b+c)/3);
    }
}
