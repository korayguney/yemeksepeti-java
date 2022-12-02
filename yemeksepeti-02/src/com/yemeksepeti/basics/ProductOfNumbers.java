package com.yemeksepeti.basics;

import java.util.Scanner;

public class ProductOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first value:");
        int firstNumber = input.nextInt();

        System.out.println("Enter second value:");
        int secondNumber = input.nextInt();

        System.out.println("Enter third value:");
        int thirdNumber = input.nextInt();

        System.out.println("Total of numbers : " + (firstNumber + secondNumber + thirdNumber));
    }
}
