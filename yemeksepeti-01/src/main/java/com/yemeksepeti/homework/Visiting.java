package com.yemeksepeti.homework;

public class Visiting extends Instructor{

    private int working_hours;
    private int hourly_fee;

    public Visiting(String name, String address, String phone, int working_hours, int hourly_fee) {
        super(name, address, phone);
        this.working_hours = working_hours;
        this.hourly_fee = hourly_fee;
    }

    public int getWorking_hours() {
        return working_hours;
    }

    public void setWorking_hours(int working_hours) {
        this.working_hours = working_hours;
    }

    public int getHourly_fee() {
        return hourly_fee;
    }

    public void setHourly_fee(int hourly_fee) {
        this.hourly_fee = hourly_fee;
    }

    @Override
    public String toString() {
        return "Visiting{" +
                "working_hours=" + working_hours +
                ", hourly_fee=" + hourly_fee +
                '}';
    }
}
