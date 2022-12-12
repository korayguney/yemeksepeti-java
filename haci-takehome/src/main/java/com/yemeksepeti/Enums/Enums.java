package com.yemeksepeti.Enums;

public enum Enums {
    XSMALL(8),
    SMALL(10),
    MEDIUM(12),
    LARGE(14),
    XLARGE(16);

    int price;

    Enums(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
