package com.songareeit.jdk14;

/**
 * JDK 14에 추가된 instanceof 패턴 매칭
 */
public class PatternMatchingInstanceof {

    public static void main(String[] args) {
        Object obj = "Hello, Pattern Matching!";

        // instanceof를 사용한 기존 코드
        if (obj instanceof String) {

            // 형변환 필요
            String str = (String) obj;
            System.out.println("Length of the string: " + str.length());
        } else {
            System.out.println("Not a String");
        }

        System.out.println("========================");

        // Pattern Matching을 사용한 코드
        if (obj instanceof String str) {

            // 형변환 필요없이 바로 str 변수 할당 후 사용
            System.out.println("Length of the string: " + str.length());
        } else {
            System.out.println("Not a String");
        }
    }
}
