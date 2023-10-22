package com.songareeit.jdk7;

/**
 * JDK 1.7에서 숫자 리터럴을 밑줄 ("_")을 사용해 가독성을 높일 수 있도록 추가됨
 */
public class NumericLiteralsWithUnderscores {

    public static void main(String[] args) {
        long creditCardNumber = 1234_5678_9012_3456L;
        int socialSecurityNumber = 123_45_6789;
        double pi = 3.141_592_65359;

        System.out.println("Credit Card Number: " + creditCardNumber);
        System.out.println("Social Security Number: " + socialSecurityNumber);
        System.out.println("Pi: " + pi);
    }
}
