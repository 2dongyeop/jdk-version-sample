package com.songareeit.jdk10;

/**
 * JDK 10에 추가된 Local-Variable
 * @see <a href="https://openjdk.org/jeps/286">Open JDK</a>
 */
public class VarLocalVariable {

    public static void main(String[] args) {

        final String name = "leedongyeop";
        System.out.println(name.getClass()); // class java.lang.String

        final var varName = "leedongyeop";
        System.out.println(varName.getClass()); // class java.lang.String
    }
}
