package com.github.designpatterns.structural.decorator;

public class Client {

    public static void main(String[] args) {

        Message m = new TextMessage("This is normal message");

        System.out.println(m.getContent());

        Message htmlEncodedMessage = new HtmlEncodedMessage(m);
        System.out.println(htmlEncodedMessage.getContent());

        Message base64EncodedMessage = new Base64EncodedMessage(m);

        System.out.println(base64EncodedMessage.getContent());
    }
}
