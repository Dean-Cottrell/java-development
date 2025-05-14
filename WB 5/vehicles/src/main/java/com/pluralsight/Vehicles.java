package com.pluralsight;

public class Vehicles {
 private String model;
 private String color;
 private int topSpeed;
 private int fuelCapacity;
 private int passengerCapacity;
 private int cargoCapacity;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public Vehicles (String model, String color, int topSpeed, int fuelCapacity, int passengerCapacity, int cargoCapacity) {
     this.model = model;
     this.color = color;
     this.topSpeed = topSpeed;
     this.fuelCapacity = fuelCapacity;
     this.passengerCapacity = passengerCapacity;
     this.cargoCapacity = cargoCapacity;

 }
}
