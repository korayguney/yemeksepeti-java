package com.yemeksepeti.basics;

public class PrimitiveTypes {
    byte aByte = 127;
    short aShort = 21121;
    int anInt = 22222;
    long aLong = 1234567890L;

    char aChar = 'a';

    float aFloat = 32.11f;
    static double aDouble; //= 12.44;

    static boolean aBoolean;

    static byte nybbles = 0b0010_0101;

    public static void main(String[] args) {
        System.out.println(aBoolean);
        System.out.println(aDouble);
        System.out.println(nybbles);
    }
}
