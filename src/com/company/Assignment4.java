package com.company;

import java.util.*;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while( n >0){
            String[] signedDate=sc.next().split("-");
            String[] currentDate=sc.next().split("-");

            int signedDay=Integer.parseInt(signedDate[0]);
            int signedMonth=Integer.parseInt(signedDate[1]);
            int signedYear=Integer.parseInt(signedDate[2]);
            int currDay=Integer.parseInt(currentDate[0]);
            int currMonth=Integer.parseInt(currentDate[1]);
            int currYear=Integer.parseInt(currentDate[2]);

            GregorianCalendar GSignedDate=new GregorianCalendar(signedYear,signedMonth-1,signedDay);
            GregorianCalendar GCurrentDate=new GregorianCalendar(currYear,currMonth-1,currDay);

            if(GCurrentDate.after(GSignedDate)){
                GregorianCalendar start=new GregorianCalendar(currYear,signedMonth-1,signedDay);
                GregorianCalendar end=new GregorianCalendar(currYear,signedMonth-1,signedDay);

                start.add(Calendar.DATE,-30);
                end.add(Calendar.DATE,+30);

                printDate(start);

                if(GCurrentDate.before(end))
                    printDate(GCurrentDate);
                else
                    printDate(end);
                System.out.println();
            }
            else
                System.out.println("No Range");
            n--;
        }
    }

    public static void printDate(GregorianCalendar cal){
        int date,month,year;
        date=cal.get(Calendar.DATE);
        month=cal.get(Calendar.MONTH)+1;
        year=cal.get(Calendar.YEAR);
        if(date/10 == 0){
            System.out.print("0"+date);
        }
        else
            System.out.print(date);
        System.out.print("-");
        if(month/10 ==0)
            System.out.print("0"+month);
        else
            System.out.print(month);
        System.out.print("-");
        System.out.print(year+" ");
    }
}
