package com.songareeit.jdk5;

/**
 * JDK 1.5에 추가된 향상된 For 문 (For Each)
 */
public class ForEach {

    public static void main(String[] args) {

        final String[] names = {"ABC", "DEF", "GHI"};

        /* JDK 1.5 이전 */
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i].charAt(0) + " ");
        }

        System.out.println("\n======");

        /* JDK 1.5 이후 */
        for (String moreName : names) {
            System.out.print(moreName.charAt(0) + " ");
        }
    }
}