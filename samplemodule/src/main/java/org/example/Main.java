package org.example;
import okhttp3.*;
import org.json.JSONObject;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url(String.format("http://geodb-free-service.wirefreethought.com//v1/geo/countries/CA"))
                .addHeader("Content-Type", "application/json")
                .build();

        try {
            Response response = client.newCall(request).execute();
            System.out.println(response);
            assert response.body() != null;
            JSONObject responseBody = new JSONObject(response.body().string());
            System.out.println(responseBody);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}