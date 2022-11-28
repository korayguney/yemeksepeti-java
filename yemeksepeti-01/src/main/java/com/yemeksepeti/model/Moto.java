package com.yemeksepeti.model;

public class Moto extends Vehicle {
    private double enginePower;

    public Moto(String model, int year, String plate, double enginePower) {
        super(model, year, plate);
        this.enginePower = enginePower;
    }

    public Moto(double enginePower) {
        this.enginePower = enginePower;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "enginePower=" + enginePower +
                "} " + super.toString();
    }
}
