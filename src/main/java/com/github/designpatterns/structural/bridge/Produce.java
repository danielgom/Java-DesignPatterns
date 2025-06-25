package com.github.designpatterns.structural.bridge;

public class Produce extends Workshop {
    @Override
    public void work() {
        System.out.println("Produced");
    }
}
