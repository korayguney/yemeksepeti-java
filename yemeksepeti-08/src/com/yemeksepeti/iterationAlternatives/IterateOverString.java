package com.yemeksepeti.iterationAlternatives;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class IterateOverString {
    public static void main(String[] args) {
        List<String> stringList  = new ArrayList<>();
        stringList.add("Koray");
        stringList.add("Ali");
        stringList.add("Veli");
        stringList.add("Ayşe");
        stringList.add("Kaan");

        System.out.println("==== ENHANCED FOR LOOP ====");
        for (String name : stringList) {
            System.out.println(name);
        }

        System.out.println("==== STANDART FOR LOOP ====");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        System.out.println("==== WHILE LOOP ====");
        int i = 0;
        while (i < stringList.size()){
            System.out.println(stringList.get(i));
            i++;
        }

        System.out.println("==== LIST ITERATOR METHOD ====");
        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }

        System.out.println("==== STREAM METHOD ====");
        stringList.forEach(name -> System.out.println(name));

    }
}
