package com.songareeit.jdk8;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        // 매개변수를 받지 않고, 무작위 숫자를 생성(리턴)하는 Supplier
        Supplier<Integer> randomValue = () -> (int) (Math.random() * 100);

        int number = randomValue.get();
        System.out.println("Random Number: " + number);
    }
}
