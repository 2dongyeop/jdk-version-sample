package com.songareeit.jdk7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceManagementPreJDK7 {

    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("something wrong1");
            System.err.println("something wrong1");
            System.err.println("something wrong1");
            System.err.println("something wrong1");
            System.err.println(e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close(); // 파일을 닫는 코드
                }
            } catch (IOException e) {
                // 파일 닫을 때 발생한 예외 처리
                System.err.println("something wrong2");
                System.err.println("something wrong2");
                System.err.println("something wrong2");
                System.err.println("something wrong2");
                System.err.println(e.getMessage());
            }
        }
    }
}
