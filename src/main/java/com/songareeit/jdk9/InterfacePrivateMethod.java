package com.songareeit.jdk9;

public class InterfacePrivateMethod {

    public static void main(String[] args) {

        CalculatorApp app = new CalculatorApp();
        int a = 3;
        int b = 5;

        int addResult = app.add(a, b);
        System.out.println("addResult = " + addResult);

        int subtractResult = app.subtract(a, b);
        System.out.println("subtractResult = " + subtractResult);
    }
}

interface Calculator {
    default int add(int a, int b) {
        printInput(a, b);
        return a + b;
    }

    default int subtract(int a, int b) {
        printInput(a, b);
        return a - b;
    }

    private void printInput(int a, int b) {
        System.out.println("a = " + a + ", b = " + b);
    }
}

class CalculatorApp implements Calculator {
}