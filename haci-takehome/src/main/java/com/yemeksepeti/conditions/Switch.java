package com.yemeksepeti.conditions;

public class Switch {
    private static final char harf = 'A';
    public static void main(String[] args) {
    switchMethod();
    ifMethod();
    }

    private static void ifMethod() {
        System.out.println("---------------------- Starting if method ------------------------------");
        if (harf == 'A'){
            System.out.println("Letter is A");
        }else if(harf == 'B'){
            System.out.println("Letter is B");
        }else if(harf == 'C'){
            System.out.println("Letter is C");
        }else if(harf == 'D'){
            System.out.println("Letter is D");
        }else if(harf == 'E'){
            System.out.println("Letter is E");
        }else {
            System.out.println("Letter was not found");
        }
    }

    private static void switchMethod() {
        System.out.println("---------------------- Starting switch method ------------------------------");
        switch (harf) {
            case 'A' -> System.out.println("Letter is A");
            case 'B' -> System.out.println("Letter is B");
            case 'C' -> System.out.println("Letter is C");
            case 'D' -> System.out.println("Letter is D");
            case 'E' -> System.out.println("Letter is E");
            default -> System.out.println("Letter was not found");
        }
    }

}
