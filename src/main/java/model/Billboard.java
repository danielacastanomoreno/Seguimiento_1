package model;

import java.io.File;

public class Billboard {

    // Attributes
    private double width;
    private double height;
    private boolean inUse;
    private String brand;

    public Billboard(double w, double h, boolean iu, String b) {

            width = w;
            height = h;
            inUse = iu;
            brand = b;

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public boolean isInUse() {
        return inUse;
    }

    public String getBrand() {
        return brand;
    }

    public double calculateArea() {

        return width * height;

    }

}


