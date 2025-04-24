package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

class Employee {
    private final String employeeId;
    private final String name;
    private final double hoursWorked;
    private final double payRate;

    public Employee(String employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public double getGrossPay() {
        return hoursWorked * payRate;
    }

    public void printPayroll() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross Pay: $" + getGrossPay());
        System.out.println("----------------------------");
    }
}

public class PayrollCalculator {
    public static void main(String[] args) {
        String filename = "employees.csv"; // File name
        ArrayList<Employee> employees = new ArrayList<>(); // Stores employee data

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = new String[0];
                System.out.println("Skipping invalid entry: " + line);
            }
            reader.close();

        } catch (Exception e) {
            System.out.println("Something went wrong!" );
        }
        System.out.println("\nPayroll Summary:");
    }
}