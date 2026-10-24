package com.ganesh.designpatterns.creational.abstractFactoryPatter;
interface CarFactory {
    Car createCar();
    CarSpecification createSpecification();
}

class NorthAmericaFactory implements  CarFactory{
    public Car createCar(){
        return new Sedan();
    }
    public CarSpecification createSpecification(){
        return new NorthAmericaSpecification();

    }
}
class EuropeCarFactory implements CarFactory {
    public Car createCar() { return new Hatchback(); }

    public CarSpecification createSpecification()
    {
        return new EuropeSpecification();
    }
}
interface Car{
    void assemble();
}
interface  CarSpecification{
    void display();
}
// Concrete Product for Sedan Car
class Sedan implements Car {
    public void assemble()
    {
        System.out.println("Assembling Sedan car.");
    }
}

// Concrete Product for Hatchback Car
class Hatchback implements Car {
    public void assemble()
    {
        System.out.println("Assembling Hatchback car.");
    }
}
class NorthAmericaSpecification
        implements CarSpecification {
    public void display()
    {
        System.out.println(
                "North America Car Specification: Safety features compliant with local regulations.");
    }
}

// Concrete Product for Europe Car Specification
class EuropeSpecification implements CarSpecification {
    public void display()
    {
        System.out.println(
                "Europe Car Specification: Fuel efficiency and emissions compliant with EU standards.");
    }
}





public class CarFactoryClient {
    public static void main(String[] args) {
        CarFactory carNorthAmerica = new NorthAmericaFactory();
        Car northAmericaCar = carNorthAmerica.createCar();
        CarSpecification northAmericaSpecification = carNorthAmerica.createSpecification();
        northAmericaCar.assemble();
        northAmericaSpecification.display();
        CarFactory europeFactory = new EuropeCarFactory();

        Car europeCar = europeFactory.createCar();
        CarSpecification europeSpecification =
                europeFactory.createSpecification();

        europeCar.assemble();
        europeSpecification.display();
    }
}
