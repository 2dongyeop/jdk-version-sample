package com.songareeit.jdk5;

public class Enumeration {

    public static void main(String[] args) {
        // 열거형 상수 사용
        Weekday today = Weekday.WEDNESDAY;
        System.out.println("Today is " + today);

        // 열거형 상수 비교
        if (today == Weekday.WEDNESDAY) {
            System.out.println("It's a weekday!");
        } else {
            System.out.println("It's not Wednesday.");
        }

        // 열거형 상수 순회
        System.out.println("Days of the week:");
        for (Weekday day : Weekday.values()) {
            System.out.println(day);
        }
    }
}

enum Weekday {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

