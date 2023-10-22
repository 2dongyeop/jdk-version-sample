package com.songareeit.jdk5;

/**
 * JDK 1.5에 추가된 Varargs
 */
public class Varargs {

    public int sumNumber(int... args) {
        System.out.println("argument length: " + args.length);

        int sum = 0;
        for (int x : args) {
            sum += x;
        }
        return sum;
    }

    public static void main(String... args) {
        Varargs varargs = new Varargs();

        int sum2args = varargs.sumNumber(2, 4);
        System.out.println("sum2 = " + sum2args);

        int sum3args = varargs.sumNumber(1, 3, 5);
        System.out.println("sum3 = " + sum3args);

        int sum4args = varargs.sumNumber(1, 3, 5, 7);
        System.out.println("sum4 = " + sum4args);

        /* 아무 값을 넣지 않아도 동작 */
        int sum0args = varargs.sumNumber();
        System.out.println("sum0 = " + sum0args);
    }
}

class NoVararg {

    public int sumNumber(int a, int b) {
        return a + b;
    }

    public int sumNumber(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        NoVararg obj = new NoVararg();
        System.out.println(obj.sumNumber(1, 2));
        System.out.println(obj.sumNumber(1, 2, 3));
    }
}