package com.yemeksepeti.polychallenge;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        super(color);
        setColor("White");
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        double area = getWidth() * getHeight();
        System.out.println("The area of Rectangle : " + area);
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
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color='" + super.getColor() + '\'' +
                '}';
    }
}
