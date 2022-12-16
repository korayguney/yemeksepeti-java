package com.yemeksepeti.generics;

import java.util.ArrayList;

public class GenericMain {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(11);
        arrayList.add(22);
       // arrayList.add("yemeksepeti");
        arrayList.add(33);

        printDouble(arrayList);
    }

    private static void printDouble(ArrayList<Integer> arrayList) {
      // for (Object o : arrayList) {
      //     System.out.println((int) o * 2);
      // }

        for (Integer o : arrayList) {
            System.out.println(o * 2);
        }
    }
}
