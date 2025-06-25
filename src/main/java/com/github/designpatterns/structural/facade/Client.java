package com.github.designpatterns.structural.facade;

public class Client {
    public static void main(String[] args) {
        VideoConversionFacade videoConversionFacade = new VideoConversionFacade();
        videoConversionFacade.convertVideo("video.ogg", "mp4");
    }
}
