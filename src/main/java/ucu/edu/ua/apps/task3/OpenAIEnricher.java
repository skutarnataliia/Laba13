package ucu.edu.ua.apps.task3;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Scanner;

import lombok.SneakyThrows;

public class OpenAIEnricher {
    @SneakyThrows
    public static Map<String, String> extract(String domain) throws IOException {
        URL url = new URL(domain);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        System.out.println(text);
        return null;
    }
}
