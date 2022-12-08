package com.yemeksepeti.passbyvalue;

public class TestStudent {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student();
        student1.setName("Ali");

        Student student2 = (Student) student1.clone();
        student2.setName("Veli");

        System.out.println("Student 1 : " + student1.getName()); // Veli
        System.out.println("Student 2 : " + student2.getName()); // Veli
    }
}
