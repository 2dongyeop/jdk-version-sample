package com.songareeit.jdk9;

import java.util.List;
import java.util.stream.Stream;

public class StreamAPIExample {

    public static void main(String[] args) {

        final List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        /* JDK 9에 추가된 Stream API takeWhile() */
        // 조건에 대해 참이 아닐 경우 바로 멈춤
        Stream<Integer> takeWhileStream = numbers.stream().takeWhile(n -> n < 6);

        takeWhileStream.forEach(System.out::print);

        System.out.println("\n=====");

        /* JDK 9에 추가된 Stream API takeWhile() */
        // 처음으로 false가 등장하는 시점까지의 요소를 모두 버리고 남은 요소를 반환
        Stream<Integer> dropWhileStream = numbers.stream().dropWhile(n -> n < 6);

        dropWhileStream.forEach(System.out::print);
    }
}
