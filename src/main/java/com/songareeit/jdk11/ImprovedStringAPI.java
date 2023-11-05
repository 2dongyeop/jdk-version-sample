package com.songareeit.jdk11;

/**
 * JDK 11에 추가된 String API
 */
public class ImprovedStringAPI {
    public static void main(String[] args) {

        final String multilineString = "Improved String API \n in \n JDK 11.";

        multilineString.lines()                  // .lines() : 문자열을 줄 단위로 나눔
                .filter(line -> !line.isBlank()) // .isBlank() : 공백인지 판단
                .map(String::strip)              // .strip() : 문자열 앞, 뒤의 공백 제거
                .forEach(line -> System.out.println("line = " + line));
    }
}
