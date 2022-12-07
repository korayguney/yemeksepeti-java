package com.yemeksepeti.bmicalculator;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        System.out.println("Enter height");
        Scanner input = new Scanner(System.in);
        double height = input.nextDouble();
        System.out.println("Height" + height);

        System.out.println("Enter weight");
        Scanner input1 = new Scanner(System.in);
        double weight = input.nextDouble();
        System.out.println("Weight" + weight);

       double bmi= weight / (height * height);

       if(bmi < 18.5){
           System.out.println("underweight");
       }
       else if(18.5 < bmi && bmi < 24.9){
           System.out.println("normal");
       }
       else if( 25.0 < bmi && bmi < 29.9){
           System.out.println("overweight");
       }
       else if( 30.0 <= bmi){
           System.out.println("very overweight");
       }
    }
}
