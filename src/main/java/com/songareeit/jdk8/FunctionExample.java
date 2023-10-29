package com.songareeit.jdk8;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        /**
         * Type parameters:
         * <T> – the type of the input to the function
         * <R> – the type of the result of the function
         */

        // 문자열을 대문자로 변환하는 Funtion
        Function<String, String> toUpperCase = (str) -> str.toUpperCase();
        String result1 = toUpperCase.apply("hello");
        System.out.println("Uppercase: " + result1);

        // 문자열을 해당 문자열의 길이로 반환하는 Funtion
        Function<String, Integer> toLength = (str) -> str.length();
        Integer result2 = toLength.apply("hello");
        System.out.println("Length: " + result2);
    }
}
