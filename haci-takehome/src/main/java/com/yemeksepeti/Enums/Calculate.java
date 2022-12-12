package com.yemeksepeti.Enums;


public class Calculate {

    public static void main(String[] args) {
        calculateEnum();
    }

    private static void calculateEnum() {
        Enums xsmall = Enums.XSMALL;
        Enums small = Enums.SMALL;
        Enums medium = Enums.MEDIUM;
        Enums large = Enums.LARGE;
        Enums xlarge = Enums.XLARGE;

        Enums[] enums = {xsmall, small, medium, large, xlarge};

        /* int sum = 0;
        for (int i = 0; i < enums.length; i++) {
            sum += enums[i].getPrice();
        }*/
        int sum = 0;
        for (Enums anEnum : enums) {
            sum += anEnum.getPrice();
        }
        System.out.println("Total prices for all of them is : " + sum);

    }





    }





