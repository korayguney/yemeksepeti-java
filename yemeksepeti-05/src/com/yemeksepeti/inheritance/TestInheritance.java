package com.yemeksepeti.inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        Circle crc = new Circle(12.5, "Green");
        System.out.println("Area of circle : " + crc.getArea());

        Cylinder cylinder = new Cylinder(12.5, "Yellow", 10);
        System.out.println("Area of cylinder : " + cylinder.getArea());
        System.out.println("Volume of cylinder : " + cylinder.getVolume());


    }
}
