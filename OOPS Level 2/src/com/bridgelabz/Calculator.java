package com.bridgelabz;

import java.util.Scanner;

//1. Java Program to create a calculator and Return a Value from a Method.
//     Explanation:
//     We make a method named input which is used to get input from the user.
//     We also make a method named add which is used to perform addition and
//     return the result back to input method where we finally print the result.
public class Calculator {

    static int a;
    static int b;
     Scanner sc=new Scanner(System.in);
    public  void input()
    {
        System.out.println("Enter num 1");
        a=sc.nextInt();

        System.out.println("Enter num 2");
         b=sc.nextInt();

        System.out.println("Addition : " + add(a,b));

    }

    public static int add(int a, int b)
    {
        int c=a+b;
        return c;
    }

    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.input();
    }
}
