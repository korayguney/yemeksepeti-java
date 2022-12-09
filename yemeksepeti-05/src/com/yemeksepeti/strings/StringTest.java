package com.yemeksepeti.strings;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "yemeksepeti"; // String (literal) common pool
        String str2 = "yemeksepeti"; // String (literal) common pool


        if (str1 == str2) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are NOT equal");
        }

        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are NOT equal");
        }

        System.out.println("---------------------------");
        String str3 = new String("yemeksepeti"); // String object
        String str4 = new String("yemeksepeti"); // String object

        if (str3 == str4) {
            System.out.println("str3 and str4 are equal");
        } else {
            System.out.println("str3 and str4 are NOT equal");
        }

        if (str3.equals(str4)) {
            System.out.println("str3 and str4 are equal");
        } else {
            System.out.println("str3 and str4 are NOT equal");
        }

        System.out.println("-------------------");
        System.out.println("Str1 : " + System.identityHashCode(str1));
        System.out.println("Str2 : " + System.identityHashCode(str2));
        System.out.println("Str3 : " + System.identityHashCode(str3));
        System.out.println("Str4 : " + System.identityHashCode(str4));
    }
}
