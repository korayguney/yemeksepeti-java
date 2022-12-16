package com.yemeksepeti.grocerylistchallenge;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {
    private List<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println("\tItem " + (i+1) + ":" + groceryList.get(i));
        }
    }

    public void modifyItemInGroceryList(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            groceryList.set(position, newItem);
        }
    }

    public int findItem(String item){
        return groceryList.indexOf(item);
    }

    public void removeItemInGroceryList(int itemIndex) {
        if(itemIndex > 0){
            groceryList.remove(itemIndex);
        }
    }

    public void removeItemInGroceryList(String item) {
        int itemIndex = findItem(item);
        removeItemInGroceryList(itemIndex);
    }

    public boolean isItemIntoGroceryList(String item){
        int itemIndex = findItem(item);
        if(itemIndex > 0){
            return true;
        }
        return false;
    }
}
