package com.yemeksepeti.logicaloperators;

public class LogicalOperators {

    public static void main(String[] args) {
        // testLogicals();
        //conditional_AND();
        conditional_OR();
    }

    private static void conditional_AND() {
        int x = 0;
        if (false & (1 == ++x)) {
            System.out.println("Inside if condition...");
        }
        System.out.println("x:" + x);
    }

    private static void conditional_OR() {
        int x = 0;
        if (true | (1 == ++x)) {
            System.out.println("Inside if condition...");
        }
        System.out.println("x:" + x);
    }

    private static void testLogicals() {
        System.out.println(false || false);
        System.out.println(true || false); // circuit breaker operators
        System.out.println(true | false); // non-circuit breaker operators
        System.out.println(false || true);
        System.out.println(true || true);
    }


}
