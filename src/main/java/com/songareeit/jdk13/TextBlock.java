package com.songareeit.jdk13;

/**
 * JDK 13에 추가된 Text Block(Multiline Strings)
 */
public class TextBlock {
    public static void main(String[] args) {

        /* Before JDK 13 */
        String multiLineString = "This is a\n"
                + "multi-line\n"
                + "string.";
        System.out.println(multiLineString);

        System.out.println("============");

        /* After JDK 13 */
        String textBlock = """
                This is a
                multi-line
                text block.""";
        System.out.println(textBlock);
    }
}
