package com.github.designpatterns.structural.facade;

public class CodecFactory {
    private CodecFactory() {}

    public static Codec extract(VideoFile file) {
        String codecType = file.getCodecType();
        if (codecType.equalsIgnoreCase("MP4")) {
            return new MPEG4CompressionCodec();
        } else if (codecType.equalsIgnoreCase("OGG")) {
            return new OggCompressionCodec();
        } else {
            throw new IllegalArgumentException("Unsupported codec type: " + codecType);
        }
    }
}
