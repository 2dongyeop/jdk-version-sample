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
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
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
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            default -> "Unknown";
        };

        System.out.println("Today is " + dayName);
    }
}
