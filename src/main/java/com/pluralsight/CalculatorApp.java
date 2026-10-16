package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner= new Scanner(System.in);

        System.out.println("-----Calculator-------");

        System.out.print("Enter the first number");
        int firstNumber= myScanner.nextInt();

        System.out.print("Enter the second number");
        int secondNumber= myScanner.nextInt();
        myScanner.nextLine();


        System.out.print("Please type A for add, S for subtract, M for Multiply or D for Divide");
        String c = myScanner.nextLine();

        if(c.equals("A")) {
            System.out.println("----Addition------");
            int sum = firstNumber + secondNumber;
            System.out.println("Result= " + sum);
        }

        if(c.equals("S")) {
            System.out.println("----Substraction------");
            int sub = firstNumber - secondNumber;
            System.out.println("Result= " + sub);
        }

        if(c.equals("M")) {
            System.out.println("----Multiply------");
            int mult = firstNumber * secondNumber;
            System.out.println("Result= " + mult);
        }

        if(c.equals("D")) {
            System.out.println("----Devision------");
            int division = firstNumber - secondNumber;
            System.out.println("Result= " + division);
        }
        System.out.println("END");

    }
}
