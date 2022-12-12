package com.yemeksepeti.interfaces;

public interface B {
    void bar();

    default void defaultMethod(){
        System.out.println("Inside default method...");
    };

    static void staticMethod(){
        System.out.println("Inside static method...");
    };
}
