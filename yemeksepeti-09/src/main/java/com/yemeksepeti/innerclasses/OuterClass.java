package com.yemeksepeti.innerclasses;

public class OuterClass {

    // static inner(nested) classes
    public static class StaticInnerClass {
        public static void printInfo() {
            System.out.println("In the static inner class...");
        }

        public void printInfoWithoutStatic() {
            System.out.println("In the static inner class WithoutStatic...");
        }
    }

    // member inner(nested) classes
    public class MemberInnerClass {
        public void printInfo() {
            System.out.println("In the member inner class...");
        }
    }

    // local inner(nested) classes
    public String printInfoFromLocalClass(int a) {
        // local class
        class LocalInnerClass {
            public String printInfo() {
                return "In the local inner class..." + a;
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        return localInnerClass.printInfo();
    }


    public static void main(String[] args) {
        StaticInnerClass.printInfo();
        System.out.println(new OuterClass().printInfoFromLocalClass(100));
    }
}


class AnotherClass {
    public static void main(String[] args) {
        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        staticInnerClass.printInfoWithoutStatic();
        OuterClass.StaticInnerClass.printInfo();

        OuterClass.MemberInnerClass memberInnerClass = new OuterClass().new MemberInnerClass();
        memberInnerClass.printInfo();

        System.out.println(new OuterClass().printInfoFromLocalClass(100));

    }
}
