package com.songareeit.jdk8;

import java.util.List;
import java.util.Arrays;

public class MethodReferenceExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Before Method Reference
        names.forEach(s -> System.out.println(s));

        // After Method Reference
        names.forEach(System.out::println);
    }
}

