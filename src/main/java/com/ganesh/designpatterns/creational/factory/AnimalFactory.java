package com.ganesh.designpatterns.creational.factory;

import java.security.PublicKey;

interface Animal{
    void sound();
}
class  Bird implements Animal{
    String animal;
    public  Bird(String animal){
        this.animal = animal;
    }
    public void sound(){
        System.out.println("Animal is Bird");
    }
}
class Cat implements  Animal{
    String animal;
    public Cat(String animal){
        this.animal = animal;
    }
    public void sound(){
        System.out.println("Animal is Cat");
    }
}
 class  AnimalFactoryDemo{
    static Animal create(String type){
        if(type.equals("cat"))return new Cat("cat");
        else if(type.equals("bird"))return new Bird("bird");
        else throw  new IllegalArgumentException("Unk");
    }
}

public class AnimalFactory {
    public static void main(String[] args) {
       Animal a = AnimalFactoryDemo.create("cat");
       Animal b = AnimalFactoryDemo.create("bird");
        a.sound();
       b.sound();
    }
}
