package com.yemeksepeti.polychallenge;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        super("black");
        this.radius = radius;
    }

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        double area = Math.PI * Math.pow(getRadius(), 2);
        System.out.println("The area of Circle : " + area);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + super.getColor() + '\'' +
                '}';
    }
}
