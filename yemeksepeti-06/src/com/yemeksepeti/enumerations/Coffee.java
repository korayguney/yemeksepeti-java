package com.yemeksepeti.enumerations;

public class Coffee {
    private CoffeeSizes coffeeSizes;

    public int calculateLitresForCoffees(CoffeeSizes[] coffeeSizes) {
        int usedLitres = 0;
        for (int i = 0; i < coffeeSizes.length; i++) {
            usedLitres += coffeeSizes[i].getLitres();
        }
        return usedLitres;
    }
}


class TestCoffee {
    public static void main(String[] args) {
        CoffeeSizes coffeeSize1 = CoffeeSizes.LARGE;
        CoffeeSizes coffeeSize2 = CoffeeSizes.MEDIUM;
        CoffeeSizes coffeeSize3 = CoffeeSizes.SMALL;
        CoffeeSizes coffeeSize4 = CoffeeSizes.SMALL;

        CoffeeSizes[] coffeeSizes = {coffeeSize1, coffeeSize2, coffeeSize3, coffeeSize4};

        System.out.println("Total litres of milk used : " + new Coffee().calculateLitresForCoffees(coffeeSizes));

        for (CoffeeSizes value : CoffeeSizes.values()) {
            System.out.println(value);
        }

        switch (coffeeSize1) {
            case LARGE:
                System.out.println("The coffe size is LARGE");
                break;
            case MEDIUM:
                System.out.println("The coffe size is MEDIUM");
                break;
            case SMALL:
                System.out.println("The coffe size is SMALL");
                break;
            default:
                break;
        }

    }
}