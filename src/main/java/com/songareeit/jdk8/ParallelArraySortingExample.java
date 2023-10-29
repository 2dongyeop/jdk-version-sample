package com.songareeit.jdk8;

import java.util.Arrays;
import java.util.Random;

public class ParallelArraySortingExample {

    /**
     * 배열을 병렬로 정렬 (아래와 같이 듀얼 피봇 퀵 정렬로 동작)
     * @see : <a href="https://hello-capo.netlify.app/algorithm-quicksort/">듀얼 피봇 퀵 정렬 설명</a>
     * DualPivotQuicksort.sort();
     */
    public static void main(String[] args) {
        // 정렬할 배열을 생성하고 랜덤 값으로 초기화
        int[] numbers = new int[1000000];

        // 랜덤 값 생성
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000000);
        }

        // 병렬 정렬
        Arrays.parallelSort(numbers);

        // 정렬된 배열 출력 (처음 10개 값만 출력)
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}