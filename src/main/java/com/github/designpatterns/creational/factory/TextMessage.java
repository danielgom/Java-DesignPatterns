package com.github.designpatterns.creational.factory;

import java.util.ArrayList;

public class TextMessage extends Message{

    @Override
    public String getContent() {

        return "Text";
    }
}
