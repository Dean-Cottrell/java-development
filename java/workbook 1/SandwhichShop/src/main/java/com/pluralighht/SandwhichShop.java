package com.pluralighht;

import java.util.Scanner;

public class SandwhichShop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Pick sandwhich size (1 for Regular, 2 for Large):");
        int size = myScanner.nextInt();
        double basePrice = (size == 1)? 5.45 : 8.95;
        System.out.println("Enter your age:");
        int age = myScanner.nextInt();
        double discount = (age <= 17) ? 0.10 : (age >= 65) ? 0.20 : 0.00;
        double finalPrice = basePrice - (basePrice * discount);
        System.out.printf("The cost of your sandwich is: $%.2f%n", finalPrice);
    }
}
