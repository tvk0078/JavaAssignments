package com.company;

import java.io.*;
import java.net.*;
import java.util.*;
import static java.lang.System.nanoTime;

public class Assignment3 {

        public static void main(String[] args) throws IOException {

            Scanner sc=new Scanner(System.in);
            ArrayList<Long> array;
            array = new ArrayList<Long>();
            System.out.println("Enter IP to continue or E to exit");
            String IPAddress;
            IPAddress = sc.nextLine();
            while(!IPAddress.equals("E")) {
                InetAddress inet;
                inet = InetAddress.getByName(IPAddress);
                if (!inet.isReachable(5000)) {
                    System.out.println("IPAddress is not reachable");
                } else {
                    System.out.println("IPAddress is Reachable");
                    long start = nanoTime();
                    long end = nanoTime();
                    long gap;
                    gap = end - start;
                    array.add(gap);
                }
                System.out.println("Enter IP to continue or E to exit");
                IPAddress=sc.nextLine();
            }
            if (array.isEmpty()) {
                return;
            }
            long time = 0;
            for (long i : array) {
                time = time + i;
            }
            System.out.println("Median time is " + time / array.size());
        }
}

