package com.songareeit.jdk5;

/**
 * JDK 1.5에서 개선된 volatile 키워드 예제 코드
 */
public class Volatile {
    private volatile boolean flag = false;

    public void toggleFlag() {
        flag = !flag;
    }

    public boolean isFlag() {
        return flag;
    }

    public static void main(String[] args) {
        Volatile example = new Volatile();

        // 스레드 1
        Thread thread1 = new Thread(() -> {
            while (!example.isFlag()) {
                // flag 값이 변경될 때까지 대기
            }
            System.out.println("Thread 1: Flag is true.");
        });

        // 스레드 2
        Thread thread2 = new Thread(() -> {
            example.toggleFlag(); // flag 값을 true로 설정
            System.out.println("Thread 2: Flag set to true.");
        });

        thread1.start();
        thread2.start();
    }
}

