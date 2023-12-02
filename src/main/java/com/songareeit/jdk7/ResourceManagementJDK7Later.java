package com.songareeit.jdk7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceManagementJDK7Later {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("something wrong");
            System.err.println("something wrong");
            System.err.println("something wrong");
            System.err.println("something wrong");
            System.err.println(e.getMessage());
        }
    }
}
