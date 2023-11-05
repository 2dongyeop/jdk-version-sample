package com.songareeit.jdk11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.net.http.HttpClient;

/**
 * JDK 11에 추가된 HTTP Client
 */
public class HttpClientExample {

    public static void main(String[] args) throws IOException, InterruptedException {

        final HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(20))
                .build();

        final HttpRequest httpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://songareeit.com"))
                .build();

        final HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        final String body = httpResponse.body();
        System.out.println("body = " + body);
    }
}
