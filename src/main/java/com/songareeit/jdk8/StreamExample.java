package com.songareeit.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Charlie");

        // 컬렉션에서 스트림 생성
        Stream<String> stream = names.stream();

        // 스트림에서 필터링하여 새로운 스트림 생성 (길이 제한)
        Stream<String> filteredStream = stream.filter(name -> name.length() > 4);

        // 매핑하여 스트림 변환 (대문자로)
        Stream<String> mappedStream = filteredStream.map(name -> name.toUpperCase());

        // 스트림을 리스트로 변환
        List<String> resultList = mappedStream.collect(Collectors.toList());

        // 결과 출력
        resultList.forEach(System.out::println); // ALICE CHARLIE
    }
}
