package com.songareeit.jdk15;

/**
 * JDK 15에서 개선된 instanceof
 * 새로운 변수를 동시에 선언하고 사용
 */
public class InstanceofExample {

    public static void main(String[] args) {
        Object obj = "Hello, Java 15!";

        if (obj instanceof String str && str.length() > 10) {
            System.out.println("문자열 길이가 10 이상입니다.");
        } else {
            System.out.println("문자열 길이가 10 미만입니다.");
        }
    }
}
