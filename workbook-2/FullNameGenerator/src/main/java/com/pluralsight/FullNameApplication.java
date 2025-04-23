package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your middle name: ");
        String middleName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter your suffix: ");
        String suffix = scanner.nextLine();

        String fullName = "";

        if (!middleName.isEmpty() && suffix.isEmpty()) {
            fullName = firstName + " " + middleName + " " + lastName;
        } else if (middleName.isEmpty() && !suffix.isEmpty()) {
            fullName = firstName + " "  + lastName + " " + suffix;

        } if (!middleName.isEmpty() && !suffix.isEmpty()) {
            fullName = firstName + " " + middleName + " " + lastName + " " + suffix;
        } else if (middleName.isEmpty() && suffix.isEmpty())
            fullName = firstName + " " + lastName;



        System.out.println("Your full name is: " + fullName);
    }
}


