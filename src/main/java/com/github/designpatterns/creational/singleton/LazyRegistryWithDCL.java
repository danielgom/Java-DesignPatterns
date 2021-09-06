package com.github.designpatterns.creational.singleton;

public class LazyRegistryWithDCL {

    private final String state = "idle";

    public String getState() {
        return state;
    }

    private LazyRegistryWithDCL() {
    }

    private static volatile LazyRegistryWithDCL INSTANCE;

    public static LazyRegistryWithDCL getInstance() {
        if (INSTANCE == null) {
            synchronized (LazyRegistryWithDCL.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "LazyRegistryWithDCL{" +
                "state='" + state + '\'' +
                '}';
    }
}
