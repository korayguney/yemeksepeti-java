package com.yemeksepeti.bmicalculator;

import java.util.Scanner;

public class BmiCalculator {

    private static Double weight;
    private static Double height;
    static Double bmi;
    private static final Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {
        getWeight();
        getHeight();
        calculateBmi();
        whatIsMyCondition();
    }

    public static void whatIsMyCondition(){
        if(bmi < 18.5){
            System.out.println(" You are underweigh");
        }else if(bmi > 18.5 && bmi<24.9){
            System.out.println(" You are normal");
        }else if(bmi > 25.0 && bmi<29.9){
            System.out.println(" You are overweigh");
        }else if(bmi > 30.0 ){
            System.out.println(" You are very overweigh");
        }else{
            System.out.println(" You entered incorrect values");
        }
    }

    public static void calculateBmi (){
        bmi = weight/(height*height);
        System.out.println("Bmi is :"+ bmi);
    }

    public static void getWeight(){
        System.out.println("Please enter weight");
        weight = myObj.nextDouble();
    }

    public static void getHeight(){
        System.out.println("Please enter height");
        height = myObj.nextDouble();
    }
}
