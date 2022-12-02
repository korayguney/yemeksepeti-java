package com.yemeksepeti.basics;

import java.util.Scanner;

public class DollarLirasConverter {
    public static void main(String[] args) {
        System.out.println("How many dollars do you have?");
        Scanner input = new Scanner(System.in);
        double dollars = input.nextDouble();
        double trLiras = 18.64;

        System.out.println(dollars + " $ is equal to " + (dollars * trLiras) + " TL.");
    }
}
