package com.songareeit.jdk8;

interface Hello {
    default void hello() {
        System.out.println("Hello!");
    }
}

class MyMessage implements Hello {
    public void customMessage() {
        System.out.println("This is a custom message.");
    }
}

public class DefaultMethodExample {
    public static void main(String[] args) {

        final MyMessage message = new MyMessage();

        message.hello();
        message.customMessage();
    }
}

