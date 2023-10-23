package com.bridgelabz;


//6. Java Program to Find Arithmetic Sum by Passing Argument Using Method Overloading
//       Explanation:
//     This is a Java Program to Find Arithmetic Sum of 2 or 3 or 4 Variables by Passing Arguments using Method Overloading.
//     Two or more methods within the same class that share the same name but with different parameter declarations are called
//     overloaded methods, and the process is referred to as method overloading.
//   Here we define a class with three different methods with the same name but different number of parameters.
//   Now these methods can be called depending upon the number of arguments passed. Hence we get three different values as output.

public class PassingArgumentUsingMethodOverloading {
    public int add(int a,int b)
    {
        return a+b;
    }
    public int add(int a, int b, int c)
    {
        return a+b+c;
    }
    public int add(int a,int b,int c,int d)
    {
        return a+b+c+d;
    }

    public static void main(String[] args) {
        PassingArgumentUsingMethodOverloading obj=new PassingArgumentUsingMethodOverloading();
        System.out.println("Sum with 4 arguments : " + obj.add(10,20,30,40));
        System.out.println("Sum with 2 arguments : " + obj.add(10,20));
        System.out.println("Sum with 3 arguments : " + obj.add(10,20,30));
    }
}
