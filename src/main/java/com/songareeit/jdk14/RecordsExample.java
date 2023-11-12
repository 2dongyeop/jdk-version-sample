package com.songareeit.jdk14;

import java.util.Objects;

/**
 * JDK 14에 추가된 Records
 */
public class RecordsExample {

    public static void main(String[] args) {

        /* JDK 14 이전 */
        PeopleClass peopleClass = new PeopleClass(25, "leedongyeop");
        System.out.println("peopleClass = " + peopleClass);

        /* JDK 14 이후 */
        PeopleRecord peopleRecord = new PeopleRecord(25, "leedongyeop");
        System.out.println("peopleRecord = " + peopleRecord);
    }
}

record PeopleRecord(
        Integer age,
        String name
) {
}

class PeopleClass {

    int age;
    String  name;

    public PeopleClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "PeopleClass[" +
                "age=" + age +
                ", name=" + name +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeopleClass that = (PeopleClass) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
