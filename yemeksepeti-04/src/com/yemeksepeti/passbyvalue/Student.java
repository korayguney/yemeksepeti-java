package com.yemeksepeti.passbyvalue;

public class Student implements Cloneable {
    private String name;
    private int schoolNumber;

    public Student() {
    }

    public Student(String name, int schoolNumber) {
        this.name = name;
        this.schoolNumber = schoolNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", schoolNumber=" + schoolNumber +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
