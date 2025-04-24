package com.pluralsight;

import java.io.File;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a bedtime story:");
        System.out.println("1. Goldilocks and the Three Bears");
        System.out.println("2. Hansel and Gretel");
        System.out.println("3. Mary Had a Little Lamb");

        System.out.print("Enter the number of the story you want to read: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        choice = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        // Select the correct file
        String fileName = "";
        if (choice == 1) fileName = "Goldilocks.txt";
        else if (choice == 2) fileName = "HanselGretel.txt";
        else if (choice == 3) fileName = "MaryLamb.txt";
        else {
            System.out.println("Something went wrong!");
            scanner.close();
            return;
            try {
                Scanner fileScanner = null;
                while (fileScanner.hasNextLine()) {
                    System.out.println(fileScanner.nextLine());
                }
                fileScanner.close();
            } catch (Exception e) {
                System.out.println("Error: Story not found. Make sure the file exists.");
            }

            scanner.close();
        }
    }

}
