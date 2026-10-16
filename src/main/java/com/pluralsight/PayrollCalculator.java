package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner= new Scanner(System.in);


        System.out.print("What is your name: ");
        String name=myScanner.nextLine();

        System.out.print("How many hours do you work? ");
        double workHours= Integer.parseInt(myScanner.nextLine());

        System.out.println("What is your pay rate?");
        double payRate= Integer.parseInt(myScanner.nextLine());

        double grossPay= workHours*payRate;

        System.out.println("Employee`s name is "+name);
        System.out.println("Gross pay is "+grossPay);

    }
}
