package com.yemeksepeti.homework;

import java.util.Objects;

public class Student {

    // states (instance variables)
    private String name;
    private int birthdate;
    private String address;
    private boolean isMale;

    // Constructors
    public Student(String name, int birthdate, String address, boolean isMale) {
        this.name = name;
        this.birthdate = birthdate;
        this.address = address;
        this.isMale = isMale;
    }

    public Student(){

    }

    // getter setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    // toString(), hashCode(), equals()

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", address='" + address + '\'' +
                ", isMale=" + isMale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return birthdate == student.birthdate && isMale == student.isMale && name.equals(student.name) && address.equals(student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthdate, address, isMale);
    }
}
