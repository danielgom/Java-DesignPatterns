package com.github.designpatterns.structural.facade;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile videoFile = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(videoFile);
        Codec destinationCodec;
        if (format.equalsIgnoreCase("MP4")) {
            destinationCodec = new MPEG4CompressionCodec();
        } else if (format.equalsIgnoreCase("OGG")) {
            destinationCodec = new OggCompressionCodec();
        } else {
            throw new IllegalArgumentException("Unsupported format: " + format);
        }

        VideoFile buffer = BitrateReader.read(videoFile, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);

        System.out.println("VideoConversionFacade: conversion finished.");
        return new AudioMixer().fix(intermediateResult);
    }
}
