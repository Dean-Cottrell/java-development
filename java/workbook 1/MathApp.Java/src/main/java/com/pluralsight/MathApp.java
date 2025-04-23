package com.pluralsight;

import java.sql.SQLOutput;

public class MathApp {
    public static void main(String[] args) {
        // Question 1
        double garySalary = 50000.0;
        double bobSalary = 80000.0;
        double highestSalary = Math.max(garySalary, bobSalary);
        System.out.println("the highest salary is" + highestSalary);

        // question 2
        double carPrice = 12000.0;
        double truckPrice = 18000.0;
        double minPrice = Math.min(carPrice,truckPrice);
        System.out.println("the smallest price" + minPrice);

        // Question 3
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("the area of the circle is" + area);

        // question 4
    }
}


