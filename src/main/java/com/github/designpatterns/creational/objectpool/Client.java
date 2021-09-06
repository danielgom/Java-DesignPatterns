package com.github.designpatterns.creational.objectpool;

import javafx.geometry.Point2D;

public class Client {

    public static final ObjectPool<Bitmap> bitmapPool =
            new ObjectPool<>(() -> new Bitmap("Logo.bmp"), 5);

    public static void main(String[] args) {
        Bitmap bitmap1 = bitmapPool.get();
        bitmap1.setLocation(new Point2D(10, 10));
        Bitmap bitmap2 = bitmapPool.get();
        bitmap2.setLocation(new Point2D(-10, 0));

        bitmap1.draw();
        bitmap2.draw();

        bitmapPool.release(bitmap1);
        bitmapPool.release(bitmap2);
    }
}
