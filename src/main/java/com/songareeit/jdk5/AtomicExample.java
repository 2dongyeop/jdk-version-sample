package com.songareeit.jdk5;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

    public static void main(String[] args) {

        SafeCounterWithLock counterWithLock = new SafeCounterWithLock();
        counterWithLock.increment();
        System.out.println("counterWithLock.getCounter() = " + counterWithLock.getCounter());

        SafeCounterWithoutLock counterWithoutLock = new SafeCounterWithoutLock();
        counterWithoutLock.increment();
        System.out.println("counterWithoutLock.getValue() = " + counterWithoutLock.getCounter());
    }
}

class SafeCounterWithoutLock {
    private final AtomicInteger counter = new AtomicInteger(0);

    int getCounter() {
        return counter.get();
    }

    void increment() {
        counter.incrementAndGet();
    }
}

class SafeCounterWithLock {
    private int counter;

    public synchronized void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}