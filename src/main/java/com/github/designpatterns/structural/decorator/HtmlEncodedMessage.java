package com.github.designpatterns.structural.decorator;

public record HtmlEncodedMessage(Message msg) implements Message {

    @Override
    public String getContent() {
        return "This is html message" + this.msg.getContent();
    }
}
