package com.pluralsight;

public class product {
            private int id;
            private String name;
            private double price;

            public product(int id, String name, double price) {
                this.id = id;
                this.name = name;
                this.price = price;
            }
            public int getId() {
                return this.id;
            }
            public String getName() {
                return this.name;
            }
            public double getPrice() {
                return this.price;
            }
        @Override
            public String toString() {
            return "product" + id + ", " + name + ", $" + price;
            }
        }
