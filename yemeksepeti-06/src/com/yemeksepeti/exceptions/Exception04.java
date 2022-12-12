package com.yemeksepeti.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exception04 {

    public static void main(String[] args) {
        // try {
        //     InputStream in = new FileInputStream("test.txt");
        // } catch (Exception e) {
        //     System.out.println("An exception occured...");
        // }
        System.out.println("Test 1");
        System.out.println("Test 2");
        System.out.println("Test 3");
        testException();
        System.out.println("Test 4");
        System.out.println("Test 5");

    }

    private static void testException() {
        String file = "test.txt";
        InputStream in = null;
        try {
            System.out.println("The file will be opened...");
           // System.out.println(1 / 0);
            in = new FileInputStream(file);
            System.out.println("The file is opened...");
        } catch (ArithmeticException | FileNotFoundException |  NullPointerException e) {
            System.out.println("An exception occured..." + e.getMessage());
        } finally {
            System.out.println("The inputstream is closed...");
            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }


}
