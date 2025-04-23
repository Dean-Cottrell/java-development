package com.pluralsight.phone;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;
    private String dial;
    public CellPhone() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void dial(String owner, String phoneNumber) {
        //


                CellPhone cellPhone1 = new CellPhone();
                cellPhone1.setSerialNumber(1234567);
                cellPhone1.setModel("iPhone X");
                cellPhone1.setCarrier("AT&T");
                cellPhone1.setPhoneNumber("800-555-5555");
                cellPhone1.setOwner("Dana Wyatt");

                // Step 2: Create the second CellPhone object
                CellPhone cellPhone2 = new CellPhone();
                cellPhone2.setSerialNumber(7654321);
                cellPhone2.setModel("Galaxy S21");
                cellPhone2.setCarrier("Verizon");
                cellPhone2.setPhoneNumber("855-555-3333");
                cellPhone2.setOwner("John Smith");

                // Step 3: Test the dial() method
                cellPhone1.dial("855-555-2222");
                cellPhone2.dial("800-555-1111");

                // Step 4: Use the display() method to show each phone's details
                display(cellPhone1);
                display(cellPhone2);
            }

    private void dial(String s) {
    }

    // Step 5: Static display() Method
            public static void display(CellPhone phone) {
                System.out.println("\nCell Phone Details:");
                System.out.println("Serial Number: " + phone.getSerialNumber());
                System.out.println("Model: " + phone.getModel());
                System.out.println("Carrier: " + phone.getCarrier());
                System.out.println("Phone Number: " + phone.getPhoneNumber());
                System.out.println("Owner: " + phone.getOwner());
            }
        }