package com.songareeit.jdk14;

/**
 * JDK 14에서 추가된 향상된 NPE Message
 */
public class HelpfulNullPointerException {

    public static void main(String[] args) {

        PeopleRecord people = new PeopleRecord(null, "leedongyeop");

        int age = people.age(); // null

        System.out.println("age = " + age); // NPE !
    }
}
