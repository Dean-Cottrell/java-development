package com.pluralsight;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class FormatDates {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneOffset.UTC);

        System.out.println("Today's Date is: " + today);

        LocalDateTime rightNow = LocalDateTime.now();


        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy HH:mm a");

        System.out.println("(MM/dd/yyyy): " + rightNow.format(format1));
        System.out.println("(yyyy-MM-dd): " + rightNow.format(format2));
        System.out.println("GMT: " + rightNow.format(format3));
    }
}
