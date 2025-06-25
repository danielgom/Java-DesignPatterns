package com.github.designpatterns.structural.facade;

public record MPEG4CompressionCodec() implements Codec {
    public String getType() {
        return "MPEG4";
    }
}
