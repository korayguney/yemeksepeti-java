package com.yemeksepeti.exceptions;

public class Exceptions09 {
    public static void main(String[] args) {
        try {
            testMethod();
        } catch (NullPointerException e) {
            throw new NullPointerException("A null object is operated...");
        } finally {
            throw new RuntimeException("Runtime exception occured...");
        }
    }

    /**
     *  @throws NullPointerException if ...
     *  @throws ArithmeticException if ...
     *
     */
    private static void testMethod() {
        String text = null;
        System.out.println(1 / 0);
        System.out.println(text.toLowerCase());
    }
}
