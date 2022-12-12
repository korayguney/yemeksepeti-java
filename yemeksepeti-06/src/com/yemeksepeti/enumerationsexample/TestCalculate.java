package com.yemeksepeti.enumerationsexample;

public class TestCalculate {
    public static void main(String[] args) {
        calculateEnum();
    }

    private static void calculateEnum() {
        TshirtEnum xsmall = TshirtEnum.XSMALL;
        TshirtEnum small = TshirtEnum.SMALL;
        TshirtEnum medium = TshirtEnum.MEDIUM;
        TshirtEnum large = TshirtEnum.LARGE;
        TshirtEnum xlarge = TshirtEnum.XLARGE;

        TshirtEnum[] TshirtEnum = {xsmall, small, medium, large, xlarge};

        /* int sum = 0;
        for (int i = 0; i < TshirtEnum.length; i++) {
            sum += TshirtEnum[i].getPrice();
        }*/
        int sum = 0;
        for (TshirtEnum anEnum : TshirtEnum) {
            sum += anEnum.getPrice();
        }
        System.out.println("Total prices for all of them is : " + sum);

    }
}
