package com.github.designpatterns.creational.singleton.recommended;

public class Singleton {

    private int data;

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    private Singleton() {}

    private static class SingletonHolder {
        private static final Singleton uniqueInstance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.uniqueInstance;
    }
}
