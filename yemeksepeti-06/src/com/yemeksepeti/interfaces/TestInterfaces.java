package com.yemeksepeti.interfaces;

public class TestInterfaces implements A,B{
    @Override
    public void foo() {

    }

    @Override
    public void bar() {

    }

    @Override
    public int foo2() {
        B.staticMethod();
        return 0;
    }


}

class TestInterfaceImpl {
    public static void main(String[] args) {
        new TestInterfaces().defaultMethod();
        new TestInterfaces().foo2();
    }
}
