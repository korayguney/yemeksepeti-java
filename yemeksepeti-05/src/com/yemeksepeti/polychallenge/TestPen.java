package com.yemeksepeti.polychallenge;

public class TestPen {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(15, 10, "yellow");

        Pen pen = new Pen();
        pen.draw(circle);
        pen.draw(rectangle);


        pen.changeColor("Red", circle);
        pen.changeColor("Blue", rectangle);


    }

}
