package se.mikka.java11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JEP321HttpClientStandardTest {

    private HttpClient client;
    private HttpRequest request;

    @BeforeEach
    public void setUp() {
        client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .followRedirects(HttpClient.Redirect.NORMAL)
                .build();

        request = HttpRequest.newBuilder()
                .uri(URI.create("http://google.se"))
                .timeout(Duration.ofMinutes(1))
                .GET()
                .build();
    }

    @Test
    public void testHttpClientStandard() throws IOException, InterruptedException {
        //When
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        //Then
        assertEquals(200, response.statusCode());
    }

    @Test
    public void testHttpClientAsynchronously() {
        //When
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenAccept(response -> {
            //Then
            assertEquals(200, response.statusCode());
        });
    }
}
