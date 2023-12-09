package com.songareeit.jdk19;

/**
 * JDK 19에 추가된 Records Pattern
 * instanceof 구문에서 레코드의 구성 요소까지 추출가능
 */
public class RecordsPatternExample {

    record Point(int x, int y) {
    }

    static void printSum(Object o) {
        if (o instanceof Point(int x, int y)) {
            System.out.println(x + y);
        }
    }

    public static void main(String[] args) {

        printSum(new Point(1, 3));
    }
}
