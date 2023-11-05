package com.songareeit.jdk11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * JDK 11에 추가된 File API
 */
public class ImprovedFileAPI {
    public static void main(String[] args) throws IOException {

        String content = "Sample text";

        // writeString() : 파일 생성 후 경로를 출력
        Path filePath = Files.writeString(
                Files.createTempFile(
                        Path.of("."),
                        "JDK11-file-example",
                        ".txt"),
                content);

        // readString() : 해당 경로에 있는 파일 내용을 읽어옴
        String fileContent = Files.readString(filePath);

        System.out.println("content = " + content);
        System.out.println("fileContent = " + fileContent);
    }
}
