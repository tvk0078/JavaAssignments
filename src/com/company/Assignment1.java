package com.company;
import java.util.*;
import java.io.File;

public class Assignment1 {
    public static void main(String[] args) {
        path p=new path();
        p.find();
    }
}
class path{
    public void find(){
        File f=new File("C:\\Users\\91765");
        String str ;
        Scanner sc = new Scanner(System.in);
        do{
            int found =0;
            System.out.print("Enter file/folder name: ");
            str =sc.nextLine();
            String[] files = f.list();
            for (String string : files){
                Boolean str1 = str.equals(string);
                if (str1){
                    found = 1;
                    System.out.print("File Found : ");
                    System.out.println(string);
                    System.out.println("Path : "+ f.getAbsolutePath());
                }
            }
            if(found == 0)
            {
                System.out.println("File not find");
            }
        } while(str != "exit");
    }
}