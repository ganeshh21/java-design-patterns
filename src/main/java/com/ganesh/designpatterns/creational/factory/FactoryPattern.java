package com.ganesh.designpatterns.creational.factory;

/**
 * Factory Design Pattern - simple example in Java.
 *
 * The factory hides object-creation logic. The client asks for a product
 * by name and gets back an object that follows a common interface.
 */
public class FactoryPattern {

    // ---- Product interface ----
    interface Shape {
        String draw();
        double area();
    }

    // ---- Concrete products ----
    static class Circle implements Shape {
        private final double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        public String draw() {
            return "Drawing a circle with radius " + radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle implements Shape {
        private final double width;
        private final double height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public String draw() {
            return "Drawing a rectangle " + width + " x " + height;
        }

        public double area() {
            return width * height;
        }
    }

    static class Square implements Shape {
        private final double side;

        Square(double side) {
            this.side = side;
        }

        public String draw() {
            return "Drawing a square with side " + side;
        }

        public double area() {
            return side * side;
        }
    }

    // ---- Factory ----
    static class ShapeFactory {
        static Shape create(String type, double... dims) {
            switch (type.toLowerCase()) {
                case "circle":
                    return new Circle(dims[0]);
                case "rectangle":
                    return new Rectangle(dims[0], dims[1]);
                case "square":
                    return new Square(dims[0]);
                default:
                    throw new IllegalArgumentException(
                            "Unknown shape '" + type + "'. Available: circle, rectangle, square");
            }
        }
    }

    // ---- Client code ----
    public static void main(String[] args) {
        Shape[] shapes = {
                ShapeFactory.create("circle", 5),
                ShapeFactory.create("rectangle", 4, 6),
                ShapeFactory.create("square", 3)
        };

        for (Shape s : shapes) {
            System.out.printf("%s -> area = %.2f%n", s.draw(), s.area());
        }

        try {
            ShapeFactory.create("triangle", 3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
