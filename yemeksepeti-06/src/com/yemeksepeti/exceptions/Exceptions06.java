package com.yemeksepeti.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Exceptions06 {
    public static void main(String[] args) {
        System.out.println("Entered main");
        try {
            methodA();
        } catch (FileNotFoundException e) {
            System.out.println("Exception catch! The file is not found...");
        }
        System.out.println("Exit from main");
    }

    private static void methodA() throws FileNotFoundException {
        System.out.println("Entered methodA");
        methodB();
        System.out.println("Exit from methodA");
    }

    private static void methodB() throws FileNotFoundException {
        System.out.println("Entered methodB");
        methodC();
        System.out.println("Exit from methodB");
    }

    private static void methodC() throws FileNotFoundException {
        System.out.println("Entered methodC");
        try {
            InputStream in = new FileInputStream("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found...");
            throw new FileNotFoundException();
        }
        System.out.println("Exit from methodC");
    }
}
