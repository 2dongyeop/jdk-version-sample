package com.songareeit.jdk5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * JDK 1.5에 추가된 Lock 인터페이스 사용 방법
 */
public class LockExample {
    private static int sharedValue = 0;
    private static final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                performTask();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                performTask();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // 스레드의 종료를 기다림
            thread2.join(); // 스레드의 종료를 기다림
        } catch (InterruptedException e) {
            System.err.println("e = " + e);
        }

        System.out.println("Final shared value: " + sharedValue);
    }

    private static void performTask() {

        /* 임계구역임을 명시 */
        lock.lock();

        try {
            int temp = sharedValue;

            temp++;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.err.println("e = " + e);
            }

            sharedValue = temp;
        } finally {
            lock.unlock();
        }
    }
}
