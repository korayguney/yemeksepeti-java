package l3classesobjects.calculatorchallenge;

public class TestCalculator {
    public static void main(String[] args) {
        int a1 = Calculator.sum(10,5);
        int a2 = Calculator.substruct(10,5);
        int a3 = Calculator.multiply(10,5);
        int a4 = Calculator.devide(10,5);
        int a5 = Calculator.pow(10,5);
        int a6 = (int) Math.pow(10,5);

        System.out.println("Sum : " + a1);
        System.out.println("Substract : " + a2);
        System.out.println("Multiply : " + a3);
        System.out.println("Devide : " + a4);
        System.out.println("Pow : " + a5);
        System.out.println("Pow2 : " + a6);
    }
}
