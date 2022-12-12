package com.yemeksepeti.enumerations;

public enum CoffeeSizes implements Foo{
    MEDIUM("Medium", 3, 32.50){
        @Override
        public void foo() {

        }

        @Override
        public double calculatePrice() {
            return this.getPrice();
        }
    },
    SMALL("Small", 1, 27.50){
        @Override
        public void foo() {

        }

        @Override
        public double calculatePrice() {
            return this.getPrice();
        }
    },
    LARGE("Large", 5, 40.0){
        @Override
        public void foo() {

        }

        @Override
        public double calculatePrice() {
            return this.getPrice();
        }
    };

    private String size;
    private int litres;
    private double price;

    CoffeeSizes(String size, int litres, double price) {
        this.size = size;
        this.litres = litres;
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public int getLitres() {
        return litres;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculatePrice();
}
