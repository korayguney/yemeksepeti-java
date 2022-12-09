package com.yemeksepeti.inheritance;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * super.getArea() + 2 * Math.PI * super.getRadius() * getHeight();
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "} " + super.toString();
    }
}
