package com.github.designpatterns.behavioural.command;

public class Stock {
    private String name = "Google";
    private int quantity = 1000;

    public void buy() {
        System.out.println("Bought " + quantity + " " + name);
    }

    public void sell() {
        System.out.println("Sold " + quantity + " " + name);
    }
}
