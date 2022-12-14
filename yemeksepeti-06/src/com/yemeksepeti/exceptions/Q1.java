package com.yemeksepeti.exceptions;

public class Q1 {
    public static void main(String[] args) {
        new Q1().go();
    }

    public void go() {
        System.out.print("A");
        try {
            stop();
        } catch (ArithmeticException e) {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
    }

    public void stop() {
        System.out.print("E");
        Object x = null;
        x.toString();
        System.out.print("F");
    }
}

//  AE
//  AEBCD
//  AEC
//  AECD
//  No output appears other than the stack trace.
