package com.songareeit.jdk8;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        // 값이 존재하는 경우
        Optional<String> notEmpty = Optional.of("Hello, Optional!");

        // 값이 존재하지 않는 경우
        Optional<String> empty = Optional.empty();

        // 값이 존재하는 경우, 값을 출력
        notEmpty.ifPresent(value -> System.out.println("Value: " + value));

        // 값이 존재하지 않는 경우, 기본값 반환
        String orElseValue = empty.orElse("Default Value");
        System.out.println("Value: " + orElseValue);

        // 값이 존재하지 않는 경우, 예외 발생
//        String value = empty.orElseThrow(() -> new IllegalArgumentException("Value is not present"));
    }
}

