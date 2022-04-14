package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class project_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an adjective ");
        String adj=sc.nextLine();
        System.out.println("Enter a girl's name ");
        String girl=sc.nextLine();
        System.out.println("Enter an adjective ");
        String adj2=sc.nextLine();
        System.out.println("Enter an occupation ");
        String occ=sc.nextLine();
        System.out.println("Enter the name of the place ");
        String plc=sc.nextLine();
        System.out.println("Enter the name of the piece of clothing ");
        String cloth=sc.nextLine();
        System.out.println("Enter another adjective ");
        String adj1=sc.nextLine();
        System.out.println("Enter a boy's name ");
        String boy=sc.nextLine();
        System.out.println("Enter a man's name ");
        String man=sc.nextLine();
        System.out.println("There once was a "+ adj + " girl named "+girl+" who was a "+adj2+ " "+occ+ " in the kingdom of "+plc+ ".");
        System.out.println("She loved to wear "+cloth+" and to swim. she wanted to marry the "+adj1+" firefighter named "+boy+" but her father, King "+man+" forbid her from seeing him.");
    }
}
