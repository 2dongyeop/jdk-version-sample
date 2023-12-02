package com.songareeit.jdk8;

import java.time.*;

/**
 * ZoneId, ZoneDateTime 으로 썸머타임 계산하기
 */
public class SummerTimeExample {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        ZoneId newYorkZone = ZoneId.of("America/New_York");
        ZonedDateTime newYorkTime = now.atZone(newYorkZone);
        System.out.println("New York Time: " + newYorkTime);

        // 썸머타임 확인
        ZoneOffset offsetStandard = newYorkTime.getOffset();
        ZoneOffset offsetDaylight = newYorkTime.withZoneSameInstant(newYorkZone).getOffset();

        if (offsetDaylight.getTotalSeconds() != offsetStandard.getTotalSeconds()) {
            System.out.println("현재는 썸머타임 기간입니다.");
        } else {
            System.out.println("현재는 썸머타임 기간이 아닙니다.");
        }
    }
}
