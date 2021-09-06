package com.github.designpatterns.structural.decorator;

public class Client {

    public static void main(String[] args) {

        Message m = new TextMessage("This is normal message");

        System.out.println(m.getContent());

        Message decorator = new HtmlEncodedMessage(m);
        System.out.println(decorator.getContent());

        decorator = new Base64EncodedMessage(m);

        System.out.println(decorator.getContent());
    }
}
