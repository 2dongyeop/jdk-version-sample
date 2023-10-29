
package com.songareeit.jdk8;

@FunctionalInterface
interface Calculator {

    // 추상 메서드를 단 한 개만 가져야 함
    int calculate(int a, int b);
}

public class FunctionalInterfaceExample {


    public static void main(String[] args) {

        // 람다 표현식을 사용하기 전
        final Calculator beforeUsingLambdaAddition = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };

        // Calculator 인터페이스를 사용한 람다 표현식
        final Calculator addition = (a, b) -> a + b;
        final Calculator subtraction = (a, b) -> a - b;

        final int result = operate(5, 3, beforeUsingLambdaAddition);
        final int result1 = operate(5, 3, addition);
        final int result2 = operate(8, 4, subtraction);

        System.out.println("Before Using Lambda Addition Result: " + result);
        System.out.println("Addition Result: " + result1);
        System.out.println("Subtraction Result: " + result2);
    }

    public static int operate(final int a, final int b, final Calculator calculator) {
        return calculator.calculate(a, b);
    }
}

