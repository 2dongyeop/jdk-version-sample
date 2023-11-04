package com.songareeit.jdk9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithCatchJDK7 {

    public static void main(String[] args) {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.err.println("error!");
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.err.println("error!");
                }
            }
        }
    }
}
