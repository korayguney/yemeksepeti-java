package com.yemeksepeti.overloading;

public class Pen {
    public double draw(Circle c) {
        double area = Math.PI * Math.pow(c.getRadius(), 2);
        return area;
    }

    public double draw(Rectangle r) {
        double area = r.getWidth() * r.getHeight();
        return area;
    }

    public String changeColor(String color, Rectangle r){
        r.setColor(color);
        return r.getColor();
    }

    public String changeColor(String color, Circle c){
        c.setColor(color);
        return c.getColor();
    }
}
