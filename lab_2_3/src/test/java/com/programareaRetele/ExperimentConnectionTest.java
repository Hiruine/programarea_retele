package com.programareaRetele;


import io.netty.handler.codec.http.DefaultHttpHeaders;
import io.netty.handler.codec.http.HttpHeaders;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.Request;
import org.asynchttpclient.Response;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import static org.asynchttpclient.Dsl.asyncHttpClient;

public class ExperimentConnectionTest {

    @Test
    public void connection() throws ExecutionException, InterruptedException {
        AsyncHttpClient asyncHttpClient = asyncHttpClient();

        HttpHeaders httpHeaders = new DefaultHttpHeaders();
        httpHeaders.add("Accept", "text/csv").add("x-api-key", "55193451-1409-4729-9cd4-7c65d63b8e76");

        ExperimentConnection experimentConnection = new ExperimentConnection(httpHeaders, "https://evil-legacy-service.herokuapp.com/api/v101/categories/");

        Request request = experimentConnection.createRequest();

        Future<Response> whenResponse = asyncHttpClient.executeRequest(request);

        Response response = whenResponse.get();


        try (BufferedReader in = new BufferedReader(new InputStreamReader(response.getResponseBodyAsStream()))) {

            String inputLine;

            while ((inputLine = in.readLine()) != null) {

                System.out.println(inputLine);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
