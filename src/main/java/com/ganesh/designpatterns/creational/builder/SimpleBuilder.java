package com.ganesh.designpatterns.creational.builder;

// Simple Builder Pattern example

class Pizza {
    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;

    // Private constructor: only the Builder can create a Pizza
    private Pizza(Builder b) {
        this.size = b.size;
        this.cheese = b.cheese;
        this.pepperoni = b.pepperoni;
        this.mushrooms = b.mushrooms;
    }

    public String toString() {
        return "Pizza [size=" + size + ", cheese=" + cheese
                + ", pepperoni=" + pepperoni + ", mushrooms=" + mushrooms + "]";
    }

    // The Builder: sets options step by step
    static class Builder {
        private String size = "medium"; // default
        private boolean cheese;
        private boolean pepperoni;
        private boolean mushrooms;

        Builder size(String size)      { this.size = size; return this; }
        Builder cheese()               { this.cheese = true; return this; }
        Builder pepperoni()            { this.pepperoni = true; return this; }
        Builder mushrooms()            { this.mushrooms = true; return this; }

        Pizza build() { return new Pizza(this); }
    }
}

public class SimpleBuilder {
    public static void main(String[] args) {
        Pizza p1 = new Pizza.Builder()
                .size("large")
                .cheese()
                .pepperoni()
                .build();

        Pizza p2 = new Pizza.Builder()
                .cheese()
                .mushrooms()
                .build();

        System.out.println(p1);
        System.out.println(p2);
    }
}
