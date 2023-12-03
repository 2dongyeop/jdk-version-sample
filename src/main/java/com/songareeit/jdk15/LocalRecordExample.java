package com.songareeit.jdk15;

/**
 * JDK 15에서 개선된 Record
 * 메서드 내부에서 Local Record 정의 가능
 */
public class LocalRecordExample {

    public static void main(String[] args) {
        record Point(int x, int y) {
            // Local Record 정의
        }

        // Local Record 사용
        final Point point = new Point(10, 20);
        System.out.println("Point: " + point);
    }
}

