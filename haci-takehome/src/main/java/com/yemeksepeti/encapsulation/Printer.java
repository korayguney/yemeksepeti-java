package com.yemeksepeti.encapsulation;

public class Printer {
    private static int tonerLevel =90;
    private static int printedPageNumber = 40;
    private static boolean dublexPrinter;

    public Printer() {
    }

    public static void main(String[] args) {
        fillUpToner();
        simulatePrint();
    }

    public static void fillUpToner(){
        while (tonerLevel <100){
            tonerLevel += 1;
        }
        System.out.println(" Toner level is : %"+ tonerLevel);
    }

    public static void simulatePrint(){
        while (printedPageNumber <100){
            printedPageNumber += 1;
        }
        System.out.println(" Printed page number is : "+ printedPageNumber);
    }




}
