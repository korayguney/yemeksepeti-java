package com.yemeksepeti.homework;

public class Permanent extends Instructor{

    private int salary;

    public Permanent(String name, String address, String phone, int salary) {
        super(name, address, phone);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Permanent{" +
                "salary=" + salary +
                '}';
    }
}
