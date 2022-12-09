package com.yemeksepeti.basics;

public class Hello {
    // instance variables (fields)
    String result = "";
    private static final float PI = 3.14f; // CONSTANTS
    private final String COUNTRY_NAME;
    int int1, int2, int3;
    double _myDouble;
    double $myDouble;
    double myDouble;
    long myLong = 11111111111L; // 64 bit
    long creditCard = 1234_5678_9012_345L; // 64 bit

    public Hello(String countryName){
        COUNTRY_NAME = countryName;
    }

    public Hello(){
        COUNTRY_NAME = "countryName";
    }

    public static void main(String[] args) {
        System.out.println("Hello Yemeksepeti");
        System.out.println("Hello \nYemeksepeti");
        System.out.println("Hello \tYemeksepeti");
        System.out.println("Hello \\Yemeksepeti");
        System.out.println("Hello \"Yemeksepeti\"");
    }

}

class TestFinal extends Hello {

    public static void main(String[] args) {
        //Calculator calculator = new Calculator();
    }
}
