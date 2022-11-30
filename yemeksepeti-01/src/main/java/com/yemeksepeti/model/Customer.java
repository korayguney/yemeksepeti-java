package com.yemeksepeti.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// POJO --> Plain Old Java Object
@Entity
public class Customer {
    // states (instance variables)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullname;
    private String address;
    private long ssid;
    private String phoneNumber;

    @OneToMany(mappedBy = "customer")
    private List<Vehicle> vehicles = new ArrayList<>();

    // Constructors
    public Customer() {
    }

    public Customer(String fullname, String address, long ssid, String phoneNumber) {
        this.fullname = fullname;
        this.address = address;
        this.ssid = ssid;
        this.phoneNumber = phoneNumber;
    }

    // custom methods
    // getter & setter
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getSsid() {
        return ssid;
    }

    public void setSsid(long ssid) {
        this.ssid = ssid;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }


    // toString(), hashCode(), equals()

    @Override
    public String toString() {
        return "Customer{" +
                "fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", ssid=" + ssid +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        return ssid == customer.ssid;
    }

    @Override
    public int hashCode() {
        return (int) (ssid ^ (ssid >>> 32));
    }
}
