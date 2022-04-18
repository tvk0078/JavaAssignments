package com.company.Assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String sentence=sc.nextLine();
        boolean startsWithCapital = Pattern.compile("[A-Z].*").matcher(sentence).matches();
        boolean endsWithPeriod = Pattern.compile(".*\\.").matcher(sentence).matches();
        if(startsWithCapital && endsWithPeriod)
        {
            System.out.println("Sentence is both beginning with capital letter and ending with a period.");
        }
        else if(startsWithCapital)
        {
            System.out.println("Sentence is only beginning with capital letter");
        }
        else if(endsWithPeriod)
        {
            System.out.println("Sentence is only ending with a period.");
        }
        else
        {
            System.out.println("Sentence is not beginning with capital letter and not ending with a period.");
        }
    }
}
