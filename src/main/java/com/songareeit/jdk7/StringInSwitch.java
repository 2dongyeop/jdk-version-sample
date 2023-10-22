package com.songareeit.jdk7;

/**
 * JDK 1.7에서부터 Switch 문에서 문자열을 사용할 수 있도록 개선됨
 */
public class StringInSwitch {

    public static void main(String[] args) {
        String fruit = "apple";

        switch (fruit) {
            case "apple":
                System.out.println("Selected fruit is an apple.");
                break;
            case "banana":
                System.out.println("Selected fruit is a banana.");
                break;
            default:
                System.out.println("Unknown fruit.");
        }
    }
}
