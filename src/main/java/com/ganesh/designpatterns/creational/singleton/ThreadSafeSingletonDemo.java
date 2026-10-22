package com.ganesh.designpatterns.creational.singleton;
class ThreadSafeSingleton{
    private ThreadSafeSingleton(){

    }
    private static class Holder{
        private static final ThreadSafeSingleton instance = new ThreadSafeSingleton();
    }
    public static ThreadSafeSingleton getInstance() {
        return Holder.instance;
    }
}
public class ThreadSafeSingletonDemo{
    public static void main(String[] args) {
        ThreadSafeSingleton obj1 =
                ThreadSafeSingleton.getInstance();

        ThreadSafeSingleton obj2 =
                ThreadSafeSingleton.getInstance();

        System.out.println(obj1 == obj2);
    }
}
