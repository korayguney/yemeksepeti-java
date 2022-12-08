package com.yemeksepeti.arrays;

import java.util.Arrays;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] arr = {23, 33, 12, 43, 56, 32, 45, 67, 78, 90};
        int givenNumber = 35;

        int[] newArr = findNumbersLessThan(arr, givenNumber);
        System.out.println(Arrays.toString(newArr));
    }

    private static int[] findNumbersLessThan(int[] arr, int givenNumber) {
        int lenghtOfNewArray = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < givenNumber) {
                lenghtOfNewArray++;
            }
        }

        int[] newArray = new int[lenghtOfNewArray];
        int indexOfNewArray = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < givenNumber) {
                newArray[indexOfNewArray] = arr[i];
                indexOfNewArray++;
            }
        }
        return newArray;
    }
}
