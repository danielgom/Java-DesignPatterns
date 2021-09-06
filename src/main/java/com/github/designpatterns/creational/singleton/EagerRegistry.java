package com.github.designpatterns.creational.singleton;

/**
 * Eager initialization of a singleton
 */
public class EagerRegistry {

    private final String state = "idle";
    private final String address = "none";

    public String getState() {
        return state;
    }

    public String getAddress() {
        return address;
    }

    private EagerRegistry() {
        System.out.println("in EagerRegistry");
    }

    private static final EagerRegistry INSTANCE =  new EagerRegistry();

    public static EagerRegistry getInstance() {
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "EagerRegistry{" +
                "state='" + state + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
