package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class StoreApp {
    public static void main(String[] args) {
        List<Product> inventory = getInventory(); // Correctly calls getInventory()
        listAllProducts(inventory); // Display products
    }

    private static List<Product> getInventory() {
        List<Product> inventory = new ArrayList<>();

        // Correctly adding products to the list
        inventory.add(new Product(1, "Hammer", 19.49));
        inventory.add(new Product(2, "Box of nails", 9.29));
        inventory.add(new Product(3, "Screwdriver", 14.99));
        inventory.add(new Product(4, "Tape Measure", 12.99));
        inventory.add(new Product(5, "Saw", 24.99));

        return inventory; // Returns the inventory list
    }

    private static void listAllProducts(List<Product> inventory) {
        for (Product product : inventory) {
            System.out.println("Product ID: " + product.getId() + ", Name: " + product.getName() + ", Price: $" + product.getPrice());
        }
    }
}

class Product {
    private final int id;
    private final String name;
    private final double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Price: $" + price;
    }
}