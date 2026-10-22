package com.ganesh.designpatterns.creational.singleton;

class BasicSingleton{
    private static BasicSingleton instance;
    private BasicSingleton(){
        System.out.println("Object Created");
    }
    public static BasicSingleton getInstance(){
        if(instance==null) instance  = new  BasicSingleton();
        return instance;
    }
}
public class BasicSingletonDemo {
    public static void main(String[] args) {
        BasicSingleton obj1 = BasicSingleton.getInstance();
        BasicSingleton obj2 = BasicSingleton.getInstance();

        System.out.println(obj1 == obj2);
    }
}
