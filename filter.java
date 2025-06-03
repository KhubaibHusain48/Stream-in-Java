package Concepts.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class filter {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "mango", "pineapple", "cherry");
        System.out.println("Printing Fruits using a stream\n");
        fruits.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("\nPrinting Fruits using a filter");
        fruits.stream().filter(fruit -> fruit.endsWith("e")).forEach(System.out::println);
    }
}
