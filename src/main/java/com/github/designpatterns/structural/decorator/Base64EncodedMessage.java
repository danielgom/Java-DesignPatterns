package com.github.designpatterns.structural.decorator;

import java.util.Base64;

public record Base64EncodedMessage(Message msg) implements Message {

    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(msg.getContent().getBytes());
    }
}
