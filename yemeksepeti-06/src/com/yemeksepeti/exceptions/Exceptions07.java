package com.yemeksepeti.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Exceptions07 {
    public static void main(String[] args) {
        System.out.println("Entered main");
        methodA();
        System.out.println("Exit from main");
    }

    private static void methodA() {
        System.out.println("Entered methodA");
        methodB();
        System.out.println("Exit from methodA");
    }

    private static void methodB() {
        System.out.println("Entered methodB");
        try {
            methodC();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured...");
        }
        System.out.println("Exit from methodB");
    }

    private static void methodC() throws ArithmeticException {
        System.out.println("Entered methodC");
        System.out.println(1 / 0);
        System.out.println("Exit from methodC");
    }
}
