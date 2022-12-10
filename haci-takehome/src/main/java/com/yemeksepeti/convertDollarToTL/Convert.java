package com.yemeksepeti.convertDollarToTL;

import java.util.Scanner;

public class Convert {
    private static final Double r = 18.64;
    private static Double turkishAmount;

    public static void main(String[] args) {
        System.out.println("Your money is: " + calculateTurkish() + " Turkish Liras ");
    }
    public static double calculateTurkish(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter dollar amount");
        try {
            Double dollarAmount = myObj.nextDouble();
            turkishAmount = dollarAmount *r;
        }catch (Exception e){
            System.out.println("You entered an incorrect amount");
        }
        return turkishAmount;
    }
}
