package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean ans=checkString(str.toLowerCase());
        System.out.println(ans);
    }

        public static boolean checkString(String input) {
            int s = 0;
            //boolean array for all the alphabets
            boolean[] arr = new boolean[26];

            for (int i = 0; i < input.length(); i++) {
                if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                    s = input.charAt(i) - 'a';
                }
                arr[s] = true;
            }

            for (int i = 0; i < 26; i++) {
                if (!arr[i]) {
                    return false;
                }
            }
            return true;
        }

        //Time Complexity is O(n)
}
