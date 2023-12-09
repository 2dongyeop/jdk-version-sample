package com.songareeit.jdk21;

import java.util.List;

public class SequencedCollectionsExample {

    public static void main(String[] args) {

        List<String> strings = List.of("1", "2", "3", "4");
        List<String> reversed = strings.reversed();

        System.out.println("strings = " + strings);
        System.out.println("reversed = " + reversed);
    }
}
