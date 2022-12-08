package com.yemeksepeti.arrays;

public class Arrayexamples {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int arr1[] = new int[5];
        int[] arr2 = {1, 2, 5, 6, 8};
        int[] arr3 = new int[]{1, 2, 5, 6, 8};

        arr[0] = 1;
        // arr[1] = 2;
        arr[2] = 4;
        arr[3] = 6;
        arr[4] = 8;
     //   arr[5] = 8;

        System.out.println("Length of array : " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + ". element değeri : " + arr[i]);
        }
        System.out.println("-----------------");
        for (int element : arr) {
            System.out.println(element);
        }


        int myarray[][] = new int[6][3];
        myarray[0][0] = 10;
        myarray[0][1] = 20;
        myarray[0][2] = 30;

        myarray[1][0] = 11;
        myarray[1][1] = 22;
        myarray[1][2] = 33;

        myarray[2][0] = 100;
        myarray[2][1] = 200;
        myarray[2][2] = 300;

        myarray[3][0] = 111;
        myarray[3][1] = 222;
        myarray[3][2] = 333;


        System.out.println(myarray[2][0]);

    }

}
