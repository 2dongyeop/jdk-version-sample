package com.songareeit.jdk8;


import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        // Predicate를 사용하여 숫자가 짝수인지 검사
        Predicate<Integer> isEven = (number) -> number % 2 == 0;

        boolean result = isEven.test(6);
        System.out.println("Is 6 even? " + result);
    }
}
