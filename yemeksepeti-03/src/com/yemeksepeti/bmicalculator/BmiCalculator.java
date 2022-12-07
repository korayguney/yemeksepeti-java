package com.yemeksepeti.bmicalculator;

import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {
        double height;
        double weight;
        double bmi;
        System.out.println("Enter your weight(enter in kg)");
        Scanner scanner = new Scanner(System.in);
        weight = scanner.nextDouble();
        System.out.println("Enter your height(enter in m)");
        height = scanner.nextDouble();
        bmi= weight / height * height;
        if (bmi < 18.5 ){
            System.out.println("You are underweight");
        }
        if (bmi > 18.5 && bmi <24.9 ){
            System.out.println("You are normal");
        }
        if (bmi > 25.0 && bmi <29.9 ){
            System.out.println("You are overweight");
        }
        if (bmi > 30.0 ){
            System.out.println("You are very overweight");
        }

    }
}
