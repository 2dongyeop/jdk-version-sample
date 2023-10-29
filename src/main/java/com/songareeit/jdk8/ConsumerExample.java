package com.songareeit.jdk8;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        final List<String> names = List.of("Alice, Bob, Charie");

        // 리스트의 각 요소를 매개변수로 받아, 출력하는 데에 사용하는 Consumer
        final Consumer<String> printName = (name) -> System.out.println(name);
        names.forEach(printName);
    }
}
