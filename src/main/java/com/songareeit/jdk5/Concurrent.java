package com.songareeit.jdk5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * JDK 1.5에서 추가된 Concurrent 패키지
 */
public class Concurrent {

    public static void main(String[] args) {
        // 스레드 풀 생성
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // 작업 제출
        executor.execute(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1 - Iteration " + i);
            }
        });

        executor.execute(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2 - Iteration " + i);
            }
        });

        executor.execute(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 3 - Iteration " + i);
            }
        });

        // 스레드 풀 종료
        executor.shutdown();
    }
}
