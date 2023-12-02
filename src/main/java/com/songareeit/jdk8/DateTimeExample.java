package com.songareeit.jdk8;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {

        // 현재 날짜 및 시간 가져오기
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current Date & Time: " + currentDateTime);

        // 날짜 연산
        LocalDate tomorrow = currentDate.plusDays(1);
        System.out.println("Tomorrow: " + tomorrow);

        // 시간 간격 계산
        Instant start = Instant.now();
        try {
            Thread.sleep(1000); // 1초 대기
        } catch (InterruptedException e) {
            // nothing
        }
        Instant end = Instant.now();

        // 차이 구하기
        Duration elapsedTime = Duration.between(start, end);
        System.out.println("Elapsed Time: " + elapsedTime.toMillis() + " milliseconds"); // Elapsed Time: 1005 milliseconds

        // 시간대 정보
        ZoneId zone = ZoneId.of("America/New_York");
        ZonedDateTime newYorkTime = ZonedDateTime.now(zone);
        System.out.println("New York Time: " + newYorkTime); // New York Time: 2023-10-29T07:53:12.441255-04:00[America/New_York]

        // 날짜 형식 설정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date & Time: " + formattedDateTime); // Formatted Date & Time: 2023-10-29 20:53:11
    }
}

