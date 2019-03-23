package com.patrickgrimard;

/**
 * Created by XTL on 8/14/2014.
 */
public class Widget {

    private String type;

    private int length;

    private int height;

    public Widget(String type, int length, int height) {
        this.type = type;
        this.length = length;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
