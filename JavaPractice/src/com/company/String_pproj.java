package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class String_pproj {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<String> al1=new ArrayList<String>();
        ArrayList<String> al2=new ArrayList<String>();
        for(int i=0;i<5;i++){
            StringBuffer sb=new StringBuffer();
            sb.append(sc.nextLine());
            int in= sb.indexOf(" ");
            //System.out.println(in);
            al1.add(sb.substring(0,in));
            al2.add(sb.substring(in+1,sb.length()));
        }
        for(int i=0;i<al1.size();i++){
            for(int j=0;j<al2.size();j++){
                System.out.println(al1.get(i)+" "+al2.get(j));
            }
        }
    }
}
