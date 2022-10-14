package com.mkyong.optional;

public class ScreenResolution {
    private int width;
    private int height;

    public ScreenResolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "ScreenResolution{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
