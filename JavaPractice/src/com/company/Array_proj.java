package com.company;
import java.util.*;
public class Array_proj {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<5;i++){
            System.out.println(arr[i]*2);
        }
    }
}
