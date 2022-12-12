package l2basicconcepts.drawrectangle;

import java.util.Scanner;

public class DrawRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is width of rectangle?");
        int width = scanner.nextInt();
        System.out.println("What is height of rectangle?");
        int height = scanner.nextInt();
        drawRectangle(width, height);
    }

    private static void drawRectangle(int width, int height) {

        for (int i = 0; i < height; i++) {

            if (i == 0 || i == height - 1) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 0; j < width - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
