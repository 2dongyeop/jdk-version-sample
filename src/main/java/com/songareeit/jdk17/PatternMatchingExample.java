package com.songareeit.jdk17;

/**
 * JDK 17에서 타입 비교 성능을 향상시키기 위해 추가된 Swtich문 기능
 */
public class PatternMatchingExample {

    public static void main(String[] args) {

        String exampleString = "patten matching example string";

        String result1 = formatterBeforeJDK17(exampleString);
        System.out.println("result1 = " + result1);

        String result2 = formatterAfterJDK17(exampleString);
        System.out.println("result2 = " + result2);
    }

    static String formatterAfterJDK17(Object o) {
        return switch (o) {
            case Integer i -> String.format("int %d", i);
            case Long l -> String.format("long %d", l);
            case Double d -> String.format("double %f", d);
            case String s -> String.format("String %s", s);
            default -> o.toString();
        };
    }

    static String formatterBeforeJDK17(Object o) {
        String formatted = "unknown";
        if (o instanceof Integer i) {
            formatted = String.format("int %d", i);
        } else if (o instanceof Long l) {
            formatted = String.format("long %d", l);
        } else if (o instanceof Double d) {
            formatted = String.format("double %f", d);
        } else if (o instanceof String s) {
            formatted = String.format("String %s", s);
        }
        return formatted;
    }
}
