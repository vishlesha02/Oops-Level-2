package com.bridgelabz;

//2. Java Program to Count Number of Objects Created for Class
  //      Explanation:Whenever an object is made of a class, its constructor is invoked.
//      Whenever the constructor runs we increment the counter value.
//      Hence the number of objects created of a class equals the counter value.

public class NumberOfObjects {
    static int count =0;
    public NumberOfObjects()
    {
        count++;
    }

    public static void main(String[] args) {
        NumberOfObjects obj1=new NumberOfObjects();
        NumberOfObjects obj2=new NumberOfObjects();
        NumberOfObjects obj3=new NumberOfObjects();
        NumberOfObjects obj4=new NumberOfObjects();
        NumberOfObjects obj5=new NumberOfObjects();
        NumberOfObjects obj6=new NumberOfObjects();
        System.out.println("Count of objects : " + count);
    }
}
