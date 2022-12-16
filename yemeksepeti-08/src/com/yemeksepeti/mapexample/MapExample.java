package com.yemeksepeti.mapexample;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new TreeMap<>();
        myMap.put("Fenerbahce", 45);
        myMap.put("Galatasaray", 40);
        myMap.put("Besiktaş", 37);
        myMap.put("Trabzonspor", 33);

        int fenerPoint = myMap.get("Fenerbahce");
        System.out.println("Point of FB :" + fenerPoint);

        System.out.println("-------------");
        for (Integer value : myMap.values()) {
            System.out.println(value);
        }
        System.out.println("-------------");
        Set<String> keys = myMap.keySet();
        keys.forEach(s -> System.out.println(s));

        System.out.println("-------------");
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
