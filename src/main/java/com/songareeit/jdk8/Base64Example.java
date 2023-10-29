package com.songareeit.jdk8;

import java.util.Base64;

public class Base64Example {
    public static void main(String[] args) {

        // 인코딩할 문자열
        String original = "Base64 Test";

        // Base64 인코딩
        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println("Encoded: " + encoded); // QmFzZTY0IFRlc3Q=

        // Base64 디코딩
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        String decoded = new String(decodedBytes);
        System.out.println("Decoded: " + decoded); // Base64 Test
    }
}

