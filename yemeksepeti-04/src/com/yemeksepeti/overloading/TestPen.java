package com.yemeksepeti.overloading;

public class TestPen {
    public static void main(String[] args) {
        Circle circle = new Circle(10, "Yellow");
        Rectangle rectangle = new Rectangle(10, 20);
        Pen pen = new Pen();

        System.out.println("Area of Circle : " + pen.draw(circle));
        System.out.println("Area of Rectangle : " + pen.draw(rectangle));

        System.out.println("Circle color before : " + circle.getColor());
        pen.changeColor("Green", circle);
        System.out.println("Circle color after : " + circle.getColor());

        System.out.println("Rectangle color before : " + rectangle.getColor());
        pen.changeColor("Black", rectangle);
        System.out.println("Rectangle color after : " + rectangle.getColor());
    }
}
