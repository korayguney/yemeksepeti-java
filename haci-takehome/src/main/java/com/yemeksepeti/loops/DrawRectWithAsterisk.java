package com.yemeksepeti.loops;

import java.util.Scanner;

public class DrawRectWithAsterisk {
    private static int width;
    private static int height;
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        drawRectangle();
    }

    private static void drawRectangle() {
        getHeight();
        getWidth();
        for (int i=1; i<width ; i++){
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < height - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < width - 2; j++) {
            System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void getWidth() {
        System.out.println(" Please enter the Width");
        width = sc.nextInt();
    }


    private static void getHeight() {
        System.out.println(" Please enter the height");
        height = sc.nextInt();
    }
}
