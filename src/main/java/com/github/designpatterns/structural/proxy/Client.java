package com.github.designpatterns.structural.proxy;

public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display();

        ProxyImage proxyImage = new ProxyImage("test.gif");
        proxyImage.display();
    }
}
