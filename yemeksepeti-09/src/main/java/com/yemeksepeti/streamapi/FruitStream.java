package com.yemeksepeti.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FruitStream {
    public static void main(String[] args) {
        List<String> fruitNames = Arrays.asList("Apple", "Apple", "Banana", "Grape", "Lemon", "Grape", "Orange", "Watermelon");

        // Apple -> 2, Grape -> 2, Lemon -> 1
        Map<String, Long> elementCounts = fruitNames.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        for (Map.Entry<String, Long> entry : elementCounts.entrySet()) {
            String element = entry.getKey();
            long count = entry.getValue();
            System.out.println(element + ": " + count);
        }
    }

}
