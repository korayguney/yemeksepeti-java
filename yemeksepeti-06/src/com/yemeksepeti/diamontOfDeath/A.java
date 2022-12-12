package com.yemeksepeti.diamontOfDeath;

interface A {
    default void performAction() {}
}

interface B extends A {
    @Override
    default void performAction() {}
}

interface C extends A {
    @Override
    default void performAction() {}
}

interface E extends B,C {
    @Override
    default void performAction() {
        //B.super.performAction();
        // or custom implementation
    }
}

