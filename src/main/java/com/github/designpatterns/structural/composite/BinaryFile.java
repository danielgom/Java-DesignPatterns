package com.github.designpatterns.structural.composite;

public class BinaryFile extends File {

    private long size;

    public BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(getName() + "size " + this.size);
    }

    @Override
    public void addFile() {

    }

    @Override
    public File[] getFiles() {
        return new File[0];
    }

    @Override
    public boolean removeFile(File file) {
        return false;
    }
}
