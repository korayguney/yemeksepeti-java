package com.yemeksepeti.exceptions;

public class Q3 {
    public static void main(String[] args) {
        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.print("c");
            throw new RuntimeException("1");
        } catch (RuntimeException e) {
            System.out.print("d");
            throw new RuntimeException("2");
        } finally {
            System.out.print("e");
            throw new RuntimeException("3");
        }
    }
}

// A. abce
// B. abde
// C. An exception with the message set to "1"
// D. An exception with the message set to "2"
// E. An exception with the message set to "3"