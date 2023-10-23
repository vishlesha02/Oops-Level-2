package com.bridgelabz;
/*7. Java Program to Find Area of Square, Rectangle and Circle using Method Overloading
Explanation
This is a Java Program to Find Area of Square, Rectangle and Circle using Method Overloading.
We declare three methods of the same name but with different numbers of arguments or with different data types.
Now when we call these methods using objects, corresponding methods will be called as per the number of arguments or their data types.*/
public class AreaUsingMethodOverLoading {

    public int area(int a)
    {
        return a*a;
    }
    public int area(int l,int w)
    {
        return l*w;
    }

    public int area(int r,double pi)
    {
        return (int) (pi*r*r);
    }
    public static void main(String[] args) {
        AreaUsingMethodOverLoading obj=new AreaUsingMethodOverLoading();
        System.out.println("Area of Square : " + obj.area(2));
        System.out.println("Area of Circle : " + obj.area(2,3.14));
        System.out.println("Area of Rectangle : " + obj.area(2,3));

    }
}
