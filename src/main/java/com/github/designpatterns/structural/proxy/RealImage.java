package com.github.designpatterns.structural.proxy;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    @Override
    public void display() {
        System.out.println("Displaying image " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading image from disk " + fileName);
    }
}
