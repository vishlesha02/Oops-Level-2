package com.bridgelabz;

import java.util.Scanner;

//4.  Java Program to Show the Nesting of Methods
//        Explanation: Enter length, breadth and height as input. After that we first call the volume method.
//        From the volume method we call the area method and from the area method we call perimeter method.
//        Hence we get the perimeter, area and volume of the cuboid as output.
public class NestingOfMethods {
   static Scanner sc=new Scanner(System.in);

    public static int area(int length, int breadth, int height)
    {
        System.out.println("Perimeter : " + perimeter(length,breadth));
        int ar = 2 * (length * breadth + length * height + breadth * height);
       return ar;
    }

    public static int volume(int length, int breadth, int height)
    {
        System.out.println("Area : " + area(length,breadth,height));
        int cu=length*breadth*height;
        return cu;
    }


    public static int perimeter(int length, int breadth)
    {
        int pr = 2 * (length + breadth);
        return pr;
    }

    public static void main(String[] args) {
        NestingOfMethods obj=new NestingOfMethods();

        System.out.println("Enter Length");
        int length=sc.nextInt();

        System.out.println("Enter Breadth");
        int breadth=sc.nextInt();

        System.out.println("Enter Height");
       int height=sc.nextInt();

        System.out.println("Volume : " + obj.volume(length,breadth,height));

    }
}
