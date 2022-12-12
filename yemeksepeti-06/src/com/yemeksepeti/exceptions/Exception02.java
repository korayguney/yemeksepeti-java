package com.yemeksepeti.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exception02 {

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
        try {
            System.out.println("The file will be opened...");
            System.out.println(1 / 0);
            InputStream in = new FileInputStream(file);
            System.out.println("The file is opened...");
        } catch (ArithmeticException e) {
            System.out.println("The statement is not valid for aritmetic operations");
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("The system could not found the file : " + file);
        } catch (IOException e) {

        }
    }


}
