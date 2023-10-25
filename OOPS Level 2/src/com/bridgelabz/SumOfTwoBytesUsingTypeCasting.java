package com.bridgelabz;

import java.util.Scanner;

/*5. Java Program to Calculate Sum of Two Byte Values using Type Casting
   Explanation: This is a Java Program to Calculate Sum of Two Byte Values Using Type Casting.
   Type casting in Java is to cast one type, a class or interface, into another type i.e.
   another class or interface.
Enter any two byte values as input. After that we first convert these two bytes into integers
 using type casting and then we add those values and get the desired output.
*/
public class SumOfTwoBytesUsingTypeCasting {

   static byte a;
   static byte b;
   static int x,y,z;

    public static int typeCasting()
    {
        z=x+y;
        return z;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st value : ");
        a=sc.nextByte();
        x = a;
        System.out.println("Enter 2nd value : ");
        b=sc.nextByte();
       y = b;

        SumOfTwoBytesUsingTypeCasting s=new SumOfTwoBytesUsingTypeCasting();
        s.typeCasting();
        System.out.println("Addition is : " + z);


    }
}
