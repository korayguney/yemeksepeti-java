package com.yemeksepeti.bmi;

import java.util.Scanner;

public class BmiCalculator {
    private static Double weight;
    private static Double height;
    static Double bmi;
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        getWeight();
        getHeiht();
        getBmi();
        whatIsMyCondition();
    }

    private static void whatIsMyCondition() {
        if(bmi < 18.5){
            System.out.println(" You are underweight");
        }else if(bmi > 18.5 && bmi<24.9){
            System.out.println(" You are normal");
        }else if(bmi > 25.0 && bmi<29.9){
            System.out.println(" You are overweight");
        }else if(bmi > 30.0 ){
            System.out.println(" You are very overweight");
        }else{
            System.out.println(" You entered incorrect values");
        }
    }

    private static void getBmi() {
        bmi = weight/(height*height);
        System.out.println("Bmi is :"+ bmi);
    }

    private static void getWeight() {
        System.out.println(" Please enter weight");
        weight = sc.nextDouble();
    }

    private static void getHeiht() {
        System.out.println(" Please enter height");
        height = sc.nextDouble();
    }

}
