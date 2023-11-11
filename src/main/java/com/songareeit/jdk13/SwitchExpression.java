package com.songareeit.jdk13;

/**
 * JDK 13에 추가된 Switch Expression - yield 키워드
 */
public class SwitchExpression {

    public static void main(String[] args) {

        int day = 3;
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> {
                System.out.println("day = " + day);
                yield "Weekday";
            }
            case 6, 7 -> {
                System.out.println("day = " + day);
                yield "Weekend";
            }
            default -> {
                System.out.println("day = " + day);
                yield "Invalid day";
            }
        };

        System.out.println("Day type: " + dayType);
    }
}
