package com.github.designpatterns.creational.abstractfactory;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Filling with Blue");
    }
}
