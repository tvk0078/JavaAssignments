package com.company.Assignment11;


import java.util.*;
import java.io.*;

public class Character {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter File Name : ");
        String fileName= input.next();
        try {
            Scanner file=new Scanner(new File(fileName));
            HashMap<java.lang.Character, Integer> hm=new HashMap<>();
            while(file.hasNext()){
                String word=file.next();
                for(char ch:word.toCharArray()){
                    if(!hm.containsKey(ch))
                        hm.put(ch,0);
                    hm.put(ch,hm.get(ch)+1);
                }
            }
            PrintWriter printWriter=new PrintWriter("output.txt");
            printWriter.println("The file "+fileName+" contains: ");
            for(Map.Entry<java.lang.Character, Integer> obj:hm.entrySet()){
                printWriter.println(obj.getKey()+" has repeated "+obj.getValue()+" times");
            }
            file.close();
            printWriter.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}