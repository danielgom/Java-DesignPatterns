package com.github.designpatterns.creational.singleton;

public class Singleton {
    // instance attribute
    private String state = "idle";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private Singleton() {}

    private volatile static Singleton INSTANCE;

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
