package com.songareeit.jdk8;


import java.util.function.BinaryOperator;

public class OperatorExample {
    public static void main(String[] args) {

        /**
         * 아래 사용된 BinaryOperator<T>는 BIFuntionFuntion<T, T, T>를 상속
         * public interface BinaryOperator<T> extends BiFunction<T,T,T>
         *
         * BiFunction<T, U, R>
         * <T> – the type of the first argument to the function
         * <U> – the type of the second argument to the function
         * <R> – the type of the result of the function
         */

        // BinaryOperator를 사용하여 두 숫자를 더함
        BinaryOperator<Integer> add = (a, b) -> a + b;
        int result = add.apply(5, 3);

        System.out.println("5 + 3 = " + result);
    }
}
