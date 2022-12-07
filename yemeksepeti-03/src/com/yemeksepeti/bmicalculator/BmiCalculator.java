package com.yemeksepeti.bmicalculator;


import java.util.Scanner;

public class BmiCalculator {

    private static Double weight;
    private static Double height;
    static Double bmi;
    private static Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {
        getWeigh();
        getHeigh();
        getBmi();
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

    public static Double getBmi (){
        bmi = weight/(height*height);
        System.out.println("Bmi is :"+ bmi);
        return bmi;
    }

    public static Double getWeigh(){
        System.out.println("Please enter weight");
        return weight = myObj.nextDouble();
    }

    public static Double getHeigh(){
        System.out.println("Please enter height");
        return height = myObj.nextDouble();
    }
}
