package com.yemeksepeti.homework;

import java.util.Objects;

public class Course {


    // states (instance variables)
    private String name;
    private int code;
    private int credit;

    // constructor

    public Course(String name, int code, int credit) {
        this.name = name;
        this.code = code;
        this.credit = credit;
    }

    public Course(){

    }

    //getter setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    //tostring equals hascdoe


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return code == course.code && credit == course.credit && name.equals(course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code, credit);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", credit=" + credit +
                '}';
    }
}
