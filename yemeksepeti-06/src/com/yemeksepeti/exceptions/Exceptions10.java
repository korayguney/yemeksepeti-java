package com.yemeksepeti.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Exceptions10 {
    public static void main(String[] args) {
        System.out.println("Entered main");
      //  try {
            methodA();
      //} catch (FileIsNotFoundException e) {
      //    System.out.println("ERROR details : " + e.getMessage());
      //    System.out.println("Exception catch! The file is not found...");
      //}
        System.out.println("Exit from main");
    }

    private static void methodA() {
        System.out.println("Entered methodA");
        methodB();
        System.out.println("Exit from methodA");
    }

    private static void methodB() {
        System.out.println("Entered methodB");
        methodC();
        System.out.println("Exit from methodB");
    }

    private static void methodC() throws FileIsNotFoundException {
        System.out.println("Entered methodC");
        try {
            InputStream in = new FileInputStream("file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found...");
            throw new FileIsNotFoundException("The file is not found...");
        }
        System.out.println("Exit from methodC");
    }
}
