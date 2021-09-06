package com.github.designpatterns.structural.decorator;

// Object to be decorated
public record TextMessage(String msg) implements Message {

    @Override
    public String getContent() {
        return msg;
    }
}
