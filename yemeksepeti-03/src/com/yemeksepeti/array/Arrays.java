package com.yemeksepeti.array;

public class Arrays {

    public static void main(String[] args) {
        int [] numbers = {23, 33, 12, 43, 56, 32, 45, 67, 78, 90};
        int given = 35;
        int [] choosenNumbers = new int[10];

        for (int i = 0; i< numbers.length; i++) {
            if (given>numbers[i]){
                choosenNumbers[i]  =numbers[i];
            }

        }
        System.out.println(java.util.Arrays.toString(choosenNumbers));
    }



}
