package com.yemeksepeti.enumerationsexample;

public enum TshirtEnum {
    XSMALL(8),
    SMALL(10),
    MEDIUM(12),
    LARGE(14),
    XLARGE(16);

    int price;

    TshirtEnum(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
