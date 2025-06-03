package Concepts.Stream;

import java.util.List;
import java.util.function.BinaryOperator;

public class reduce {
    public static void main(String[] args) {
        List<Integer> num = List.of(1, 2, 3, 4, 5);
        int sum = num.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                });
        System.out.println("Sum is: " + sum);

        int newSum = num.stream().reduce(0, (x, y) -> x + y);
        System.out.println("New sum is: " + newSum);

        int max = num.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println("Max is: " + max);
    }
}
