package com.github.designpatterns.creational.singleton.recommended;

public class Client {
    public static void main(String[] args) {
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();

        System.out.println(firstInstance == secondInstance);

        firstInstance.setData(100);
        System.out.println(firstInstance.getData());
        System.out.println(secondInstance.getData());
        System.out.println(firstInstance.getData() == secondInstance.getData()); // Same instance, same value
    }
}
