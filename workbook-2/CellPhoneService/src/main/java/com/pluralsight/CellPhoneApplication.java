package com.pluralsight;
import java.util.Scanner;
public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();

                Scanner scanner = new Scanner(System.in);

        phone = new CellPhone();

                System.out.print("Enter the serial number: ");
                phone.setSerialNumber(scanner.nextInt());
                scanner.nextLine();

                System.out.print("Enter the model: ");
                phone.setModel(scanner.nextLine());

                System.out.print("Enter the carrier: ");
                phone.setCarrier(scanner.nextLine());

                System.out.print("Enter the phone number: ");
                phone.setPhoneNumber(scanner.nextLine());

                System.out.print("Enter the owner's name: ");
                phone.setOwner(scanner.nextLine());

                scanner.close();

                System.out.println("\nHere is the information you provided:");
                System.out.println("Serial Number: " + phone.getSerialNumber());
                System.out.println("Model: " + phone.getModel());
                System.out.println("Carrier: " + phone.getCarrier());
                System.out.println("Phone Number: " + phone.getPhoneNumber());
                System.out.println("Owner: " + phone.getOwner());


    }
}
