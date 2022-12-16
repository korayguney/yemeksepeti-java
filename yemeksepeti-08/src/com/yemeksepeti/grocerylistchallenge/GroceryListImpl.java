package com.yemeksepeti.grocerylistchallenge;

import java.util.Scanner;

public class GroceryListImpl {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean flag = true;
        int choice = 0;

        while (flag) {
            printInstructions();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItemIntoList();
                    break;
                case 3:
                    modifyItemIntoList();
                    break;
                case 4:
                    removeItemFromList();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    flag = false;
                    break;
            }
        }

    }

    private static void searchItem() {
        System.out.println("Enter item name to search: ");
        String item = scanner.next();
       // if (groceryList.isItemIntoGroceryList(item)) {
       //     System.out.println(item + " is exist into list");
       // } else {
       //     System.out.println(item + " is NOT exist into list");
       // }
        // ternary operator
        String message = groceryList.isItemIntoGroceryList(item)
                ? item + " is exist into list"
                : item + " is NOT exist into list";
        System.out.println(message);
    }

    private static void removeItemFromList() {
        System.out.println("Enter item name to remove: ");
        String currentItem = scanner.next();
        groceryList.removeItemInGroceryList(currentItem);
    }

    private static void modifyItemIntoList() {
        System.out.println("Enter existing item name: ");
        String currentItem = scanner.next();
        System.out.println("Enter new item name: ");
        String newItem = scanner.next();
        groceryList.modifyItemInGroceryList(currentItem, newItem);
    }

    private static void addItemIntoList() {
        System.out.println("Enter item name: ");
        String item = scanner.next();
        groceryList.addGroceryItem(item);
    }

    private static void printInstructions() {
        System.out.println("Select Operation: ");
        System.out.println("\t1- Print the list of grocery items.");
        System.out.println("\t2- Add an item to the list.");
        System.out.println("\t3- Modify an item in the list.");
        System.out.println("\t4- Remove an item from the list.");
        System.out.println("\t5- Search for an item in the list.");
        System.out.println("\t6- Quit the application.");
    }

}
