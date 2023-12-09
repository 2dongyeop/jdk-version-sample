package com.songareeit.jdk19;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

/**
 * JDK 19애서 추가돤 가상 스레드 사용 예제. (핵심)
 */
public class VirtualThreadExample {

    public static void main(String[] args) throws InterruptedException {
        // threadName: main
        // availableProcessors: 8
        System.out.println("\nthreadName: " + Thread.currentThread().getName() + "\navailableProcessors: " + Runtime.getRuntime().availableProcessors());

        final long start = System.currentTimeMillis();
        final AtomicLong index = new AtomicLong();
        final int count = 100;
        final CountDownLatch countDownLatch = new CountDownLatch(count);

        final Runnable runnable = () -> {
            try {
                final long indexValue = index.incrementAndGet();
                Thread.sleep(1000L);

                // threadName:
                // value: xx
                System.out.println("\nthreadName: " + Thread.currentThread().getName() + "\nvalue: " + indexValue);

                countDownLatch.countDown();
            } catch (final InterruptedException e) {
                countDownLatch.countDown();
            }
        };

        // 일반적으로 쓰레드 풀의 갯수를 지정하는 것과는 달리 쓰레드의 갯수를 지정할 필요가 없다.
        try (final ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < count; i++) {
                executorService.submit(runnable);
            }
        }

        countDownLatch.await();
        final long finish = System.currentTimeMillis();
        final long timeElapsed = finish - start;

        // threadName: main
        // Run time: 1063
        System.out.println("\nthreadName: " + Thread.currentThread().getName() + "\nRun time: " + timeElapsed);
    }
}