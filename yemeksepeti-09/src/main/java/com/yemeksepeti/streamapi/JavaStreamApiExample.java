package com.yemeksepeti.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamApiExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Koray");
        names.add("Koray");
        names.add("Koray");
        names.add("Ali");
        names.add("Hasan");
        names.add("Ayşe");
        names.add("Ayşe");
        names.add("Ayşe");
        names.add("Ayşe");
        names.add("Elif");
        names.add("Ezgi");
        names.add("Gökhan");
        names.add("Serkan");
        names.add("Serkan");
        names.add("Serkan");
        names.add("Serkan");
        names.add("Fatma");

        System.out.println("----- FILTER ------");
        // names.stream().filter(new Predicate<String>() {
        //     @Override
        //     public boolean test(String name) {
        //         return name.length() < 5;
        //     }
        // }).filter(new Predicate<String>() {
        //     @Override
        //     public boolean test(String name) {
        //         return name.startsWith("E");
        //     }
        // }).forEach(new Consumer<String>() {
        //     @Override
        //     public void accept(String name) {
        //         System.out.println("In the forEach method :  " + name);
        //     }
        // });

        names.stream().filter(n -> n.length() < 5).filter(n -> n.startsWith("E"))
                .forEach(name -> System.out.println("In the forEach method :  " + name));

        System.out.println("----- MAP ------");
        // names.stream().map(new Function<String, Employee>() {
        //     @Override
        //     public Employee apply(String name) {
        //         return new Employee(name);
        //     }
        // }).filter(new Predicate<Employee>() {
        //     @Override
        //     public boolean test(Employee employee) {
        //         return employee.name.equals("Fatma");
        //     }
        // }).forEach(new Consumer<Employee>() {
        //     @Override
        //     public void accept(Employee employee) {
        //         System.out.println(employee);
        //     }
        // });

        //names.stream().map(n -> new Employee(n)).filter(e -> e.name.equals("Fatma"))
        //         .forEach(e -> System.out.println(e));

        names.stream().map(n -> new Employee(n)).filter(e -> e.name.equals("Fatma")).forEach(System.out::println);

        System.out.println("----- DISTINCT ------");
        names.stream().distinct().forEach(System.out::println);

        System.out.println("----- LIMIT ------");
        names.stream().limit(1).forEach(System.out::println);

        System.out.println("----- PEEK ------");
        names.stream().filter(n -> n.length() < 5)
                .peek(name -> System.out.println("Peek : " + name))
                .filter(n -> n.startsWith("E"))
                .forEach(name -> System.out.println("In the forEach method :  " + name));

        System.out.println("----- SORTED ------");
        // names.stream().distinct().sorted().forEach(s -> System.out.println(s));
        // names.stream().distinct().sorted((n1, n2) -> n2.compareTo(n1)).forEach(s -> System.out.println(s));
        names.stream().distinct().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));

        System.out.println("----- COLLECT ------");
        List<String> filteredNames = names.stream().filter(s -> s.startsWith("E")).distinct().collect(Collectors.toList());
        for (String filteredName : filteredNames) {
            System.out.println("Filtered name " + filteredName);
        }

        System.out.println("----- COUNT ------");
        System.out.println("Count : " + names.stream().filter(s -> s.startsWith("E")).distinct().count());

        System.out.println("----- MAX ------");
        System.out.println("Count : " + names.stream().distinct().max((n1, n2) -> n1.compareTo(n2)));

        System.out.println("----- MIN ------");
        System.out.println("Count : " + names.stream().distinct().min((n1, n2) -> n1.compareTo(n2)));

        System.out.println("----- REDUCE ------");
        Optional<String> reduceList = names.stream().distinct().reduce((s1, s2) -> s1.concat(s2));
        reduceList.ifPresent(System.out::println);
    }

    static class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
