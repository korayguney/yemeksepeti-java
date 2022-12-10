package com.yemeksepeti.loops;

import java.util.Scanner;

public class Loops {
    private static int number;
    public static void main(String[] args) {
        whileLoop(10);
        forLoop(10);
        calculateNaturalNumbers();
    }

    private static void calculateNaturalNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number");
        number = sc.nextInt();
        int calculateNaturalNumbers = (number*(number+1))/2;
        System.out.println("calculateNaturalNumbers = " + calculateNaturalNumbers);
    }

    private static void forLoop(int number) {
        int sum=0;
        for (int i=0; i<=number ; i++){
            sum = sum +i;
        }
        System.out.println("forLoop = " + sum);
    }

    private static void whileLoop(int number) {
        int sum=0;
        int i= 0;
        while (i<=number){
            sum = sum+i;
            i++;
        }
        System.out.println("whileLoop = " + sum);
    }

}
