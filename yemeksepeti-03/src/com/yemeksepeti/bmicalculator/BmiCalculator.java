package com.yemeksepeti.bmicalculator;


import java.util.Scanner;

public class BmiCalculator {

    private static Double weight;
    private static Double height;
     static Double result;

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter weight");
        weight = myObj.nextDouble();
        System.out.println("Please enter height");
        height = myObj.nextDouble();
        result = weight/height;
        if(result < 18.5){
            System.out.println(" You are underweigh");
        }else if(result > 18.5 && result<24.9){
            System.out.println(" You are normal");
        }else if(result > 25.0 && result<29.9){
            System.out.println(" You are overweigh");
        }else if(result > 30.0 ){
            System.out.println(" You are very overweigh");
        }else{
            System.out.println(" You entered incorrect values");
        }



}}
