package com.yemeksepeti.basics;

public class ShorthandOperators {
    public static void main(String[] args) {
        //int x = 2;
        //int z = ++x; // x = 3
        //int y = --x;
//
        //System.out.println("x:" + x); // 2
        //System.out.println("z:" + z); // 3 & 2
        //System.out.println("y:" + y); // 2 & 1
        //System.out.println("x:" + x); // 2

        int x = 12;
        int y = x;
        x++;
        System.out.println(x); // 13
        System.out.println(y); // 12
    }
}
