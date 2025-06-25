package com.github.designpatterns.creational.singleton;

public class Client {

    public static void main(String[] args) {
        // Singleton
        Singleton lazy1 = Singleton.getInstance();
        Singleton lazy2 = Singleton.getInstance();

        System.out.println(lazy1);
        System.out.println(lazy2);

        System.out.println(lazy1 == lazy2);
    }
}
