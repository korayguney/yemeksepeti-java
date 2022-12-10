package com.yemeksepeti.convertDollarToTL;

public class Test {
    public static void main(String[] args) {

       array();
    }

    private static void array() {
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        for (int i : numbers) {
            System.out.println(i);
        }
    }

    private static void outerForLoop() {
        outer:
        for(int i=0;i<100;i++){
            for(int x=0;x<50;x++){
            if(x<30){
                System.out.println("i= "+ i + " x = " + x);
            }
            else
            break outer;
        } }
    }

    private static void continueForLoop() {
        for( int i = 0 ; i < 10 ; i++ )
        {
            if( i == 5 )
                continue;
            System.out.println("" + i);
        }
    }

    private static void breakForLoop() {
        for( int i = 0 ; i < 10 ; i++ ) {
            if( i == 3 )
                break;
            System.out.println("" + i);
        }
    }

    private static void forLoop() {
        int a = 0;
        for( int i = 0 ; i < 100 ; i++ )
        {
            a += i;
        }
        System.out.println("Sum is : " + a);
    }

    private static void doWhileLoop() {
        int a = 0;
        int i = 0;
        do {
            a += i;// a=a+1;
            i++;
        } while(i<100);
        System.out.println("Sum is : " + a);
    }

    private static void whileLoop() {
        int a = 0;
        int i = 0;
        while(i<100)
        {
            a += i; // a=a+1;
            i++;
        }
        System.out.println("Sum is : " + a);
    }

    private static void check2(int number) {
        if (number < 10 && number > 0) {
            if (number > 5) {
                System.out.println("The number is bigger than 5 but less than 10");
            } else {
                System.out.println("The number is less or equal to 5");
            }
        } else {
            System.out.println("The number is not between 0 and 10");
        }
    }

    public static void check1(){
        int x = 12;
        int y = x;
        x++; System.out.println(x); System.out.println(y);
    }
}
