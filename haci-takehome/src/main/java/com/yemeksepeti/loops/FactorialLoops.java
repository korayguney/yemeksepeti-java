package com.yemeksepeti.loops;

import java.util.Scanner;

public class FactorialLoops {
    private static int number = 5;

    public static void main(String[] args) {
        forLoop(number);
        whileLoop(number);
        calculateFactorial();
    }

    private static void calculateFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number");
        number = sc.nextInt();
        int fact= 1;
        for(int i=1; i<=number; i++){
            fact = fact*i;
        }
        System.out.println("calculateFactorial result is : " + fact);
    }

    private static void whileLoop(int number) {
        int i =1;
        int fact= 1;
        while (i<=number){
            fact=fact*i;
            i++;
        }
        System.out.println("whileLoop result is : " + fact);
    }

    private static void forLoop(int number) {
        int fact= 1;
        for (int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("forLoop result is : " + fact);
    }
}
