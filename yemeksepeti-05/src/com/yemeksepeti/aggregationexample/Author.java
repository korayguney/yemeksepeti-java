package com.yemeksepeti.aggregationexample;

public class Author {
    private String name;
    private String email;
    private char gender = 'm';

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        } else {
            System.out.println("Wrong input for gender");
            throw new IllegalArgumentException("Wrong input for gender");
        }
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}