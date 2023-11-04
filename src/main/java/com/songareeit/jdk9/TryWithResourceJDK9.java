package com.songareeit.jdk9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceJDK9 {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.err.println("error!");
        }
    }
}
