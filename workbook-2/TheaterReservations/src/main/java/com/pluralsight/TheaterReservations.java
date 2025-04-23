package com.pluralsight;
 import java.time.format.DateTimeFormatter;
 import java.util.Scanner;
public class TheaterReservations {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullname = scanner.nextLine();
        System.out.println("Enter The date of the show");
        String date = scanner.nextLine();
        System.out.println("Enter the number of tickets needed:");
        int tickets = scanner.nextInt();
        System.out.println(tickets + " ticket(s) reserved for " + date + " under " + fullname);


    }
}
