package com.yemeksepeti.model;

public abstract class Vehicle {
    // instance variables
    private String model;
    private int year;
    private String plate;

    // constuctors
    public Vehicle(String model, int year, String plate) {
        this.model = model;
        this.year = year;
        this.plate = plate;
    }

    public Vehicle() {
    }

    // getter & setter

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }


    // toString(), hashCode(), equals()


    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", plate='" + plate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        return plate != null ? plate.equals(vehicle.plate) : vehicle.plate == null;
    }

    @Override
    public int hashCode() {
        return plate != null ? plate.hashCode() : 0;
    }
}
