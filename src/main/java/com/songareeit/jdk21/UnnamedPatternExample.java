package com.songareeit.jdk21;

import java.util.List;

/**
 * JDK 21에 추가된 UnnamedPattern & UnnamedVariable
 * 변수명을 _ 와 같이 언더바로 선언 가능
 */
public class UnnamedPatternExample {

    public static void main(String[] args) {
        int total = 0;
        int LIMIT = 3;
        List<String> strings = List.of("1", "2", "3");

        // --enabled-preview 필요
        for (String _ : strings) {
            if (total < LIMIT) {

                System.out.println("UnnamedPatternExample.main");
            }
        }
    }
}
