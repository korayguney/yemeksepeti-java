package com.yemeksepeti.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Vehicle {
    // instance variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String model;
    private int year;
    private String plate;

    @ManyToOne
    private Customer customer;

    @ManyToMany
    private List<Accident> accidents = new ArrayList<>();

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Accident> getAccidents() {
        return accidents;
    }

    public void setAccidents(List<Accident> accidents) {
        this.accidents = accidents;
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
