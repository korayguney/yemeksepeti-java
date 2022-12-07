package com.yemeksepeti.basics;

import java.lang.String;
import java.util.List;

// comment...
public class Calculator {
    String name;
    List<String> strings;
    java.awt.List test;
    int counter = 0;

    /*
         aaa
         bbb
     */
    public static void main(String[] args) {
        double result = new Calculator().calculateSumOfNumbers(1.2, 3.5, 4.5, 3.1, 5.6, 6.743, 3.46);
        System.out.println("Result of sum : " + result);
        System.out.println("------------------");
        System.out.println("Result of sum : " + Calculator.calculateSumOfNumbers(1.2, 3.5));
        System.out.println("Result of sum : " + Calculator.calculateSumOfNumbers(1.2, 3.5));
        System.out.println("Result of sum : " + Calculator.calculateSumOfNumbers(1.2, 3.5));
        System.out.println("Result of sum : " + Calculator.calculateSumOfNumbers(1.2, 3.5));
        System.out.println("Counter : " + new Calculator().counter);
    }

    public static double calculateSumOfNumbers(double number1, double number2) {
        double result = number1 + number2;
        new Calculator().counter = new Calculator().counter + 1;
        return result;
    }

    // Variable Length Argument Lists
    public static double calculateSumOfNumbers(double... numbers) {
        double result = 0;
        for (int i = 0; i < numbers.length; i++) {
            // result = result + numbers[i];
            result += numbers[i];
        }
        return result;
    }


    public void callStatics() {
        calculateSumOfNumbers(1, 3);
    }


}
