package com.github.designpatterns.structural.facade;

public record OggCompressionCodec() implements Codec {
    public String getType() {
        return "OGG";
    }
}
