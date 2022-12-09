package com.yemeksepeti.polychallenge;

public class Pen {

    public void draw(Shape shape) {
        shape.draw();
    }

    public void changeColor(String color, Shape shape) {
        shape.setColor(color);

        if (shape instanceof Circle) {
            System.out.println("Ccrcle color is : " + shape.getColor());
        } else if (shape instanceof Rectangle) {
            System.out.println("Rectangle color is : " + shape.getColor());
        }

    }

}
