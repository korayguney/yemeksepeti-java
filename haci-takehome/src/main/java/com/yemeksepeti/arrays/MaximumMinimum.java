package com.yemeksepeti.arrays;

import java.util.Scanner;

public class MaximumMinimum {
    private static final int[] arr = new int[3];
    static Scanner sc = new Scanner(System.in);
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        find();
    }

    private static void find() {
        for (int i=0;i< arr.length;i++){
            System.out.println(" Please enter the number");
            arr[i] =sc.nextInt();
        }
        for (int number : arr) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("The minimum number is " + min);
        System.out.println("The maximum number is " + max);
    }




}
