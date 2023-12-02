package com.songareeit.jdk12;

/**
 * JDK 12에 추가된 Switch Expression
 */
public class ImprovedSwitchExpression {

    public static void main(String[] args) {

        int day = 3;
        String dayName;

        /* Before JDK 12 */
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
            case 3:
                dayName = "Not monday";
                break;
            default:
                dayName = "Unknown";
                break;
        }

        System.out.println("Today is " + dayName);
        System.out.println("==================");

        /* After JDK 12 */
        dayName = switch (day) {
            case 1 -> "Monday";
            case 2, 3 -> "Not monday";
            default -> "Unknown";
        };

        System.out.println("Today is " + dayName);
    }
}
