package com.yemeksepeti.loops;

public class LoopTest {
    public static void main(String[] args) {
        // testWithWhileLoop();
        //testWithDoWhileLoop();
        //testWithForLoop();
        //testWithForLoop2();
        testWithForLoop3();
    }

    private static void testWithForLoop3() {
        int a = 0;

        outher:
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 50; j++) {
                if (j < 30) {
                    System.out.println("i = " + i + ", j = " + j);
                } else {
                    break outher;
                }
            }
            a += i;
        }
        System.out.println("Sum = " + a);


    }

    private static void testWithForLoop2() {
        int a = 0;

        for (int i = 0; i < 100; i++) {
            if (i == 10) {
                continue;
                //break;
            }
            a += i;
        }
        System.out.println("Sum = " + a);

    }

    private static void testWithForLoop() {
        int a = 0;

        for (int i = 0; i < 100; i++) {
            a += i;
        }
        System.out.println("Sum = " + a);
    }

    private static void testWithDoWhileLoop() {
        int a = 0;
        int i = 0;

        do {
            a += i;
            i++;
        } while (i < 100);

        System.out.println("Sum = " + a);
    }

    private static void testWithWhileLoop() {
        int a = 0;
        int i = 0;

        while (i < 100) {
            a += i;
            i++;
        }
        System.out.println("Sum = " + a);

    }
}
