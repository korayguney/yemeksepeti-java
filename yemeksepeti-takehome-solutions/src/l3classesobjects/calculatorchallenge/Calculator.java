package l3classesobjects.calculatorchallenge;

public class Calculator {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int substruct(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int devide(int a, int b) {
        return a / b;
    }

    public static int pow(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
             result = result * a;
        }
        return result;
       // return (int) Math.pow(a, b);
    }
}
