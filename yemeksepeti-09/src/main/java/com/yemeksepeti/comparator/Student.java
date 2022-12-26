package com.yemeksepeti.comparator;

public class Student {
    private String name;
    private long id = 0;
    private double gpa = 0.0;

    public Student(String name, long id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gpa=" + gpa +
                '}';
    }

    public double getGpa() {
        return gpa;
    }
}
