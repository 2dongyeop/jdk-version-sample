package com.songareeit.jdk21;

import java.text.MessageFormat;

/**
 * JDK 21에 추가된 문자열 보간법 제공
 */
public class StringTemplatesExample {

    public static void main(String[] args) {
        String feelsLike = "good";
        String temperature = "30";
        String unit = "c";

        // Before JDK 21
        System.out.println(composeUsingFormatters(feelsLike, temperature, unit));
        System.out.println(composeUsingMessageFormatter(feelsLike, temperature, unit));

        // After JDK 21 : Using STR(String Template)
        // --enabled-preview 필요
//        System.out.println(usingSTRProcessor(feelsLike, temperature, unit));
//        System.out.println(usingSTRJSONBlock(feelsLike, temperature, unit));
    }

    static String composeUsingFormatters(String feelsLike, String temperature, String unit) {
        return String.format("Today's weather is %s, with a temperature of %s degrees %s",
                feelsLike, temperature, unit);
    }

    static String composeUsingMessageFormatter(String feelsLike, String temperature, String unit) {
        return MessageFormat.format("Today''s weather is {0}, with a temperature of {1} degrees {2}",
                feelsLike, temperature, unit);
    }

    // --enabled-preview 필요
//    static String usingSTRProcessor(String feelsLike, String temperature, String unit) {
//        return STR
//                . "Today's weather is \{ feelsLike }, with a temperature of \{ temperature } degrees \{ unit }" ;
//    }
//
//    static String usingSTRJSONBlock(String feelsLike, String temperature, String unit) {
//        return STR
//                . """
//      {
//        "feelsLike": "\{ feelsLike }",
//        "temperature": "\{ temperature }",
//        "unit": "\{ unit }"
//      }
//      """ ;
//    }
}
